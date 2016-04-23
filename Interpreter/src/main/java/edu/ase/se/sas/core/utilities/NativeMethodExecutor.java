package edu.ase.se.sas.core.utilities;

import java.util.HashMap;
import java.util.Map;

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
				System.out.print(ParameterParser.getParsedValue(params));
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
				System.out.println(ParameterParser.getParsedValue(params));
			}
			return true;
		}
	},
	/**
	 * Stores a variable in the {@link Entry#symbolTable} for a given scope.
	 */
	STORE {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = ParameterParser.getParams(params);
			String varName = paramArr[0].trim();
			String value = paramArr[1].trim();

			Object val = ParameterParser.getParsedValue(value);

			Entry entry = Runtime.entryStack.peek();
			int scope = entry.symbolTable.size();
			entry.symbolTable.get(scope).put(varName, val);
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
			String[] paramArr = ParameterParser.getParams(params);
			String varName = paramArr[0].trim();
			String opr1 = paramArr[1].trim();
			String opr2 = paramArr[2].trim();
			Object val1 = ParameterParser.getParsedValue(opr1);
			Object val2 = ParameterParser.getParsedValue(opr2);
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
			String[] paramArr = ParameterParser.getParams(params);
			String funcName = paramArr[0];
			Integer lineNo = Runtime.methodIndexMap.get(funcName);

			if (lineNo == null) {
				throw new RuntimeException(funcName + " Function definition not found");
			}

			Map<String, Object> methodValMap = new HashMap<String, Object>();
			if (paramArr.length > 1) {
				String instruction = Runtime.instructionMap.get(lineNo);
				String[] methodParams = ParameterParser.getParams(instruction);
				if (paramArr.length != methodParams.length) {
					throw new RuntimeException(funcName + " Function parameters mismatch Exception");
				}
				for (int i = 1; i < paramArr.length; i++) {
					Object val = ParameterParser.getParsedValue(paramArr[i]);
					methodValMap.put(methodParams[i], val);
				}
			}
			Entry entry = new Entry();
			entry.symbolTable.put(1, methodValMap);
			Runtime.entryStack.push(entry);
			Runtime.runMethod(lineNo + 1);
			return true;
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
			Object returnVal = ParameterParser.getParsedValue(params);
			Runtime.returnValStack.push(returnVal);
			Runtime.entryStack.pop();
			return false;
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
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.symbolTable.size();
		Map<String, Object> valMap = entry.symbolTable.get(scope);
		String[] paramArr = ParameterParser.getParams(params);
		String varName = paramArr[0].trim();
		Integer val1;
		Integer val2;
		String opr1 = paramArr[1].trim();
		String opr2 = paramArr[2].trim();
		if (opr1.matches("^\\d+$")) {
			val1 = Integer.parseInt(opr1);
		} else {
			val1 = (Integer) ParameterParser.getValue(opr1);
		}
		if (opr2.matches("^\\d+$")) {
			val2 = Integer.parseInt(opr2);
		} else {
			val2 = (Integer) ParameterParser.getValue(opr2);
		}

		switch (opName) {
		case "ADD":
			valMap.put(varName, val1 + val2);
			break;
		case "SUB":
			valMap.put(varName, val1 - val2);
			break;
		case "MUL":
			valMap.put(varName, val1 * val2);
			break;
		case "DIV":
			valMap.put(varName, val1 / val2);
			break;
		case "LT":
			valMap.put(varName, val1 < val2);
			break;
		case "LTE":
			valMap.put(varName, val1 <= val2);
			break;
		case "GT":
			valMap.put(varName, val1 > val2);
			break;
		case "GTE":
			valMap.put(varName, val1 >= val2);
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
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.symbolTable.size();
		Map<String, Object> valMap = entry.symbolTable.get(scope);
		String[] paramArr = ParameterParser.getParams(params);
		String varName = paramArr[0].trim();
		Boolean val1;
		Boolean val2 = null;
		String opr1 = paramArr[1].trim();
		if (opr1.matches("T|F")) {
			val1 = Boolean.parseBoolean(opr1);
		} else {
			val1 = (Boolean) ParameterParser.getValue(opr1);
		}
		String opr2;
		if (paramArr.length > 2) {
			opr2 = paramArr[2].trim();
			if (opr2.matches("T|F")) {
				val1 = Boolean.parseBoolean(opr2);
			} else {
				val2 = (Boolean) ParameterParser.getValue(opr2);
			}
		}

		switch (opName) {
		case "AND":
			valMap.put(varName, val1 && val2);
			break;
		case "OR":
			valMap.put(varName, val1 || val2);
			break;
		case "NOT":
			valMap.put(varName, !val1);
			break;
		}
	}
}
