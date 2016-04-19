package edu.ase.se.sas.core.runtime;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.components.MethodInfo;
import edu.ase.se.sas.core.utilities.INativeMethodExecutor;
import edu.ase.se.sas.core.utilities.Loader;
import edu.ase.se.sas.core.utilities.NativeMethodExecutor;
import edu.ase.se.sas.exceptions.RuntimeException;

public class Runtime {

	public static final Map<String, Object> globalVarMap = new HashMap<String, Object>();

	public static final Stack<MethodInfo> methodInfoStack = new Stack<MethodInfo>();

	public static final Stack<Entry> entryStack = new Stack<Entry>();

	public void run(Loader loader) throws RuntimeException {

		Entry entry = new Entry();
		entry.valueMap.put(1, new HashMap<String, Object>());
		entryStack.push(entry);
		for (int i = loader.mStartNo + 1; i < loader.mEndNo; i++) {
			String instruction = loader.instructionMap.get(i);
			String[] instrArr = instruction.split(" +", 2);
			String opCode = instrArr[0];
			String params = "";
			if (instrArr.length == 2) {
				params = instrArr[1];
			}
			try {
				INativeMethodExecutor exec = NativeMethodExecutor.valueOf(opCode);
				exec.execute(params);
			} catch (IllegalArgumentException e) {
				throw new RuntimeException("Illegal Op code used: " + opCode + " " + e.getMessage());
			}
		}
	}

}
