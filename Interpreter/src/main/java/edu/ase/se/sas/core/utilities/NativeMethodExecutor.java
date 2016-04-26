package edu.ase.se.sas.core.utilities;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * The NativeMethodExecutor implements INativeMethodExecutor and defines the
 * logic to be executed when an OP code is encountered.
 *
 *
 */
public enum NativeMethodExecutor implements INativeMethodExecutor {

	/**
	 * Prints either a String, Boolean or an Integer Value directly or that is
	 * stored in a variable.
	 */
	PRINT {
		@Override
		public boolean execute(String params) throws RuntimeException {
			if (params.matches("\".*\"")) {
				System.out.print(params.substring(1, params.length() - 1));
			} else {
				System.out.print(Common.getParsedValue(params));
			}
			return true;
		}
	},
	/**
	 * Prints either a String, Boolean or an Integer Value directly or that is
	 * stored in a variable in a new line.
	 */
	PRINTLN {
		@Override
		public boolean execute(String params) throws RuntimeException {
			if (params.matches("\".*\"")) {
				System.out.println(params.substring(1, params.length() - 1));
			} else {
				System.out.println(Common.getParsedValue(params));
			}
			return true;
		}
	},
	/**
	 * Declaration block for integers, Zero is assigned to the variable by
	 * default.
	 */
	DCLRI {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, 0);
			return true;
		}
	},
	/**
	 * Declaration block for Booleans, False is assigned to the variable by
	 * default.
	 */
	DCLRB {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, false);
			return true;
		}
	},
	/**
	 * Declaration block for Strings, Empty string is assigned to the variable
	 * by default.
	 */
	DCLRS {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, "");
			return true;
		}
	},
	/**
	 * Declaration block for Integer Stack, Empty stack is assigned to the
	 * variable by default.
	 */
	DCLRSI {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, new Stack<Integer>());
			return true;
		}
	},
	/**
	 * Declaration block for Boolean Stack, Empty stack is assigned to the
	 * variable by default.
	 */
	DCLRSB {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, new Stack<Boolean>());
			return true;
		}
	},
	/**
	 * Declaration block for String Stack, Empty stack is assigned to the
	 * variable by default.
	 */
	DCLRSS {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, new Stack<String>());
			return true;
		}
	},
	PUSH {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			String value = paramArr[1].trim();
			Object val = Common.getParsedValue(value);

			Common.storeValue(varName, val);

			return true;
		}
	},
	POP {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			String value = paramArr[1].trim();

			Object val = Common.getParsedValue(value);

			Common.storeValue(varName, val);
			return true;
		}
	},

	/**
	 * Stores a variable in the {@link Entry#symbolTable} for a given scope.
	 */
	STORE {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			String value = paramArr[1].trim();

			Object val = Common.getParsedValue(value);

			Common.storeValue(varName, val);
			return true;
		}
	},
	/**
	 * Reads the value from the console and stores it into a variable
	 */
	READ {
		@SuppressWarnings("resource")
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			Scanner in = new Scanner(System.in);
			String value = in.nextLine();
			if (!value.matches("^\\d+$") && !value.matches("T|F")) {
				value = "\"" + value + "\"";
			}
			Object val = Common.getParsedValue(value);
			Common.storeValue(varName, val);
			return true;
		}
	},
	/**
	 * Adds two numbers and stores the result in a variable.
	 */
	ADD {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("ADD", params);
			return true;
		}
	},
	/**
	 * Subtracts two numbers and stores the result in a variable.
	 */
	SUB {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("SUB", params);
			return true;
		}
	},
	/**
	 * Multiplies two numbers and stores the result in a variable.
	 */
	MUL {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("MUL", params);
			return true;
		}
	},
	/**
	 * Divides two numbers and stores the result in a variable.
	 */
	DIV {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("DIV", params);
			return true;
		}
	},
	/**
	 * 
	 */
	REM {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("REM", params);
			return true;
		}
	},
	/**
	 * Compares if first operand is less than the second and stores true or
	 * false in a variable.
	 */
	LT {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("LT", params);
			return true;
		}
	},
	/**
	 * Compares if first operand is less than or equal to the second and stores
	 * true or false in a variable.
	 */
	LTE {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("LTE", params);
			return true;
		}
	},
	/**
	 * Compares if first operand is greater than the second and stores true or
	 * false in a variable.
	 */
	GT {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("GT", params);
			return true;
		}
	},
	/**
	 * Compares if first operand is greater than or equal to the second and
	 * stores true or false in a variable.
	 */
	GTE {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("GTE", params);
			return true;
		}
	},
	/**
	 * Compares if first operand is equal to the second and stores true or false
	 * in a variable.
	 */
	EQ {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			Map<String, Object> valMap = entry.symbolTable.get(scope);
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			String opr1 = paramArr[1].trim();
			String opr2 = paramArr[2].trim();
			Object val1 = Common.getParsedValue(opr1);
			Object val2 = Common.getParsedValue(opr2);
			valMap.put(varName, val1 == val2);
			return true;
		}
	},
	/**
	 * Performs AND operation on 2 operands and saves the result in a variable.
	 */
	AND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doBoolOps("AND", params);
			return true;
		}
	},
	/**
	 * Performs OR operation on 2 operands and saves the result in a variable.
	 */
	OR {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doBoolOps("OR", params);
			return true;
		}
	},
	/**
	 * Performs NOT operation on the operands and saves the result in a
	 * variable.
	 */
	NOT {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doBoolOps("NOT", params);
			return true;
		}
	},
	/**
	 * Compares if first operand is not equal to the second and stores true or
	 * false in a variable.
	 */
	NEQ {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			Map<String, Object> valMap = entry.symbolTable.get(scope);
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			String opr1 = paramArr[1].trim();
			String opr2 = paramArr[2].trim();
			Object val1 = Common.getParsedValue(opr1);
			Object val2 = Common.getParsedValue(opr2);
			valMap.put(varName, val1 != val2);
			return true;
		}
	},
	/**
	 * Increments the scope in the {@link Entry#symbolTable}.
	 */
	BSTART {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.put(scope + 1, new HashMap<String, Object>());
			return true;
		}
	},
	/**
	 * Decrements the scope in the {@link Entry#symbolTable}.
	 */
	BEND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.remove(scope);
			if (!Runtime.ifStack.isEmpty()) {
				Runtime.runCode(Runtime.ifStack.pop());
				return false;
			}
			return true;
		}
	},
	/**
	 * Pushes a new entry onto the {@link Runtime#entryStack}
	 * 
	 * Copies the parameter values to the function arguments in the
	 * {@link Entry#symbolTable}
	 */
	GOTO {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			if (paramArr.length == 1 && paramArr[0].matches("^\\d+$")) {
				Integer lineNo = Integer.parseInt(paramArr[0]);
				Runtime.runCode(lineNo);
				return false;
			} else {
				String funcName = paramArr[0];
				Integer lineNo = Runtime.methodIndexMap.get(funcName);

				if (lineNo == null) {
					throw new RuntimeException(funcName + " Function definition not found");
				}

				Map<String, Object> methodValMap = new HashMap<String, Object>();
				if (paramArr.length > 1) {
					String instruction = Runtime.instructionMap.get(lineNo);
					String[] methodParams = Common.getParams(instruction);
					if (paramArr.length != methodParams.length) {
						throw new RuntimeException(funcName + " Function parameters mismatch Exception");
					}
					for (int i = 1; i < paramArr.length; i++) {
						Object val = Common.getParsedValue(paramArr[i]);
						methodValMap.put(methodParams[i], val);
					}
				}
				Entry entry = new Entry();
				entry.symbolTable.put(1, methodValMap);
				Runtime.entryStack.push(entry);
				Runtime.runCode(lineNo + 1);
				return true;
			}
		}
	},

	/**
	 * Stops the execution of the program.
	 */
	MEND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			return false;
		}

	},
	/**
	 * Returns the control back to the calling function.
	 */
	FEND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Runtime.entryStack.pop();
			return false;
		}

	},
	/**
	 * Returns the control back to the calling function and pushes the return
	 * value onto the {@link Runtime#returnValStack}
	 */
	RETURN {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Object returnVal = Common.getParsedValue(params);
			Runtime.returnValStack.push(returnVal);
			Runtime.entryStack.pop();
			if (!Runtime.ifStack.isEmpty()) {
				Runtime.ifStack.pop();
			}
			return false;
		}
	},
	/**
	 * Indicates the code has entered an if block.
	 */
	IF {
		@Override
		public boolean execute(String params) throws RuntimeException {
			return true;
		}
	},
	/**
	 * Indicates code has entered an else block.
	 */
	ELSE {
		@Override
		public boolean execute(String params) throws RuntimeException {
			return true;
		}
	},
	/**
	 * Checks if a given variable is true or false and based on the value jumps
	 * to a certain line to execute the code.
	 */
	CHECKT {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = Common.getParams(params);
			String varName = paramArr[0].trim();
			boolean value = (boolean) Common.getParsedValue(varName);
			Integer opr1 = Integer.parseInt(paramArr[1].trim());

			Integer opr2 = null;
			if (paramArr.length > 2) {
				opr2 = Integer.parseInt(paramArr[2].trim());
			} else {
				opr2 = opr1;
			}

			if (value) {
				if (paramArr.length > 2) {
					Runtime.ifStack.push(opr2);
				}
				Runtime.runCode(Runtime.execLine + 1);
			} else {
				Runtime.runCode(opr1);
			}
			return false;
		}
	},
	/**
	 * Indicates a loop is being executed.
	 */
	LOOP {
		@Override
		public boolean execute(String params) throws RuntimeException {
			return true;
		}
	};

	/**
	 * 
	 * @param opName
	 *            The Op Code of the instruction
	 * @param params
	 *            The parameters to the OP Code
	 * @throws RuntimeException
	 *             When something goes wrong during the execution.
	 */
	private static void doMathOp(String opName, String params) throws RuntimeException {
		String[] paramArr = Common.getParams(params);
		String varName = paramArr[0].trim();
		String opr1 = paramArr[1].trim();
		String opr2 = paramArr[2].trim();
		Integer val1 = (Integer) Common.getParsedValue(opr1);
		Integer val2 = (Integer) Common.getParsedValue(opr2);

		switch (opName) {
		case "ADD":
			Common.storeValue(varName, val1 + val2);
			break;
		case "SUB":
			Common.storeValue(varName, val1 - val2);
			break;
		case "MUL":
			Common.storeValue(varName, val1 * val2);
			break;
		case "DIV":
			Common.storeValue(varName, val1 / val2);
			break;
		case "LT":
			Common.storeValue(varName, val1 < val2);
			break;
		case "LTE":
			Common.storeValue(varName, val1 <= val2);
			break;
		case "GT":
			Common.storeValue(varName, val1 > val2);
			break;
		case "GTE":
			Common.storeValue(varName, val1 >= val2);
			break;
		case "REM":
			Common.storeValue(varName, val1 % val2);
			break;
		}
	}

	/**
	 * 
	 * @param opName
	 *            The Op Code of the instruction
	 * @param params
	 *            The parameters to the OP Code
	 * @throws RuntimeException
	 *             When something goes wrong during the execution.
	 */
	private static void doBoolOps(String opName, String params) throws RuntimeException {
		String[] paramArr = Common.getParams(params);
		String varName = paramArr[0].trim();

		Boolean val2 = null;
		String opr1 = paramArr[1].trim();

		Boolean val1 = (Boolean) Common.getParsedValue(opr1);
		String opr2;
		if (paramArr.length > 2) {
			opr2 = paramArr[2].trim();
			val2 = (Boolean) Common.getParsedValue(opr2);
		}

		switch (opName) {
		case "AND":
			Common.storeValue(varName, val1 && val2);
			break;
		case "OR":
			Common.storeValue(varName, val1 || val2);
			break;
		case "NOT":
			Common.storeValue(varName, !val1);
			break;
		}
	}
}
