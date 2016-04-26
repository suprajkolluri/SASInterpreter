package edu.ase.se.sas.core.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.utilities.INativeMethodExecutor;
import edu.ase.se.sas.core.utilities.Loader;
import edu.ase.se.sas.core.utilities.NativeMethodExecutor;
import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * The Runtime is responsible for executing the instructions of the intermediate
 * code.
 * 
 * The execution starts from the main block in the intermediate code.
 * 
 * The Runtime also maintains several data structures to assist various
 * operations during the code execution.
 *
 */
public class Runtime {

	/**
	 * The global variable map stores all the globally declared variable values
	 * which can be accessed from anywhere in the code.
	 */
	public static final Map<String, Object> globalVarMap = new HashMap<String, Object>();

	/**
	 * The return value stack is maintained to store the return values passed
	 * from a function.
	 * 
	 * The values are pushed on the stack in the called method and then popped
	 * when the control returns to the calling function.
	 */
	public static final Stack<Object> returnValStack = new Stack<Object>();

	/**
	 * Stack of {@link Entry} objects to maintain various block and method
	 * scopes.
	 */
	public static final Stack<Entry> entryStack = new Stack<Entry>();

	/**
	 * Maps all the function names to the lines in which they are defined.
	 */
	public static final Map<String, Integer> methodIndexMap = new HashMap<String, Integer>();

	/**
	 * Maps all the instructions to the lines in which they are defined.
	 */
	public static final Map<Integer, String> instructionMap = new HashMap<Integer, String>();

	/**
	 * Contains the line of the code that is being executed.
	 */
	public static int execLine = 1;

	/**
	 * Maintains the list of integers to jump to after executing the if block
	 */
	public static Stack<Integer> ifStack = new Stack<Integer>();

	/**
	 * The execution entry point of the program where the main method is
	 * executed.
	 * 
	 * @param loader
	 *            The instructor Loader instance
	 * @throws RuntimeException
	 *             When something goes wrong during the code execution.
	 */
	public static void run(Loader loader) throws RuntimeException {
		Entry entry = new Entry();
		entry.symbolTable.put(1, new HashMap<String, Object>());
		entryStack.push(entry);
		runCode(loader.mStartNo + 1);
	}

	/**
	 * Used to execute a method from the line where it starts.
	 * 
	 * @param startLine
	 *            The line where the method definition starts.
	 * @throws RuntimeException
	 *             When something goes wrong during the code execution.
	 */
	public static void runCode(int startLine) throws RuntimeException {
		boolean continueExec = true;
		while (continueExec) {
			String instruction = instructionMap.get(startLine);
			execLine = startLine;
			String[] instrArr = instruction.split(" +", 2);
			String opCode = instrArr[0];
			String params = "";
			if (instrArr.length == 2) {
				params = instrArr[1];
			}
			try {
				INativeMethodExecutor exec = NativeMethodExecutor.valueOf(opCode);
				continueExec = exec.execute(params);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException("Illegal Op code used: " + opCode + " " + e.getMessage());
			}
			startLine++;
		}
	}
}
