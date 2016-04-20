package edu.ase.se.sas.core.utilities;

import java.util.HashMap;
import java.util.Map;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.RuntimeException;

public enum NativeMethodExecutor implements INativeMethodExecutor {

	PRINT {
		@Override
		public boolean execute(String params) throws RuntimeException {
			if (params.matches("\".*\"")) {
				System.out.print(params.substring(1, params.length() - 1));
			} else {
				System.out.print(getParsedValue(params));
			}
			return true;
		}
	},
	PRINTLN {
		@Override
		public boolean execute(String params) throws RuntimeException {
			if (params.matches("\".*\"")) {
				System.out.println(params.substring(1, params.length() - 1));
			} else {
				System.out.println(getParsedValue(params));
			}
			return true;
		}
	},
	STORE {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = getParams(params);
			String varName = paramArr[0].trim();
			String value = paramArr[1].trim();

			Object val = getParsedValue(value);

			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			entry.valueMap.get(scope).put(varName, val);
			return true;
		}
	},
	ADD {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("ADD", params);
			return true;
		}
	},
	SUB {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("SUB", params);
			return true;
		}
	},
	MUL {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("MUL", params);
			return true;
		}
	},
	DIV {
		@Override
		public boolean execute(String params) throws RuntimeException {
			doMathOp("DIV", params);
			return true;
		}
	},
	BSTART {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			entry.valueMap.put(scope + 1, new HashMap<String, Object>());
			return true;
		}
	},
	BEND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			entry.valueMap.remove(scope);
			return true;
		}
	},
	GOTO {
		@Override
		public boolean execute(String params) throws RuntimeException {
			String[] paramArr = getParams(params);
			String funcName = paramArr[0];
			Integer lineNo = Runtime.methodIndexMap.get(funcName);

			if (lineNo == null) {
				throw new RuntimeException(funcName + " Function definition not found");
			}

			Map<String, Object> methodValMap = new HashMap<String, Object>();
			if (paramArr.length > 1) {
				String instruction = Runtime.instructionMap.get(lineNo);
				String[] methodParams = getParams(instruction);
				if (paramArr.length != methodParams.length) {
					throw new RuntimeException(funcName + " Function parameters mismatch Exception");
				}
				for (int i = 1; i < paramArr.length; i++) {
					Object val = getParsedValue(paramArr[i]);
					methodValMap.put(methodParams[i], val);
				}
			}
			Entry entry = new Entry();
			entry.valueMap.put(1, methodValMap);
			Runtime.entryStack.push(entry);
			Runtime.runMethod(lineNo + 1);
			return true;
		}
	},

	MEND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			return false;
		}

	},
	FEND {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Runtime.entryStack.pop();
			return false;
		}

	},
	RETURN {
		@Override
		public boolean execute(String params) throws RuntimeException {
			Object returnVal = getParsedValue(params);
			Runtime.returnValStack.push(returnVal);
			Runtime.entryStack.pop();
			return false;
		}
	};

	private static Object getValue(String var) throws RuntimeException {
		Object returnVal = null;
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.valueMap.size();
		while (scope >= 1) {
			Map<String, Object> map = entry.valueMap.get(scope);
			if (map.containsKey(var)) {
				returnVal = map.get(var);
				break;
			} else {
				scope--;
			}
		}
		if (returnVal == null) {
			returnVal = Runtime.globalVarMap.get(var);
			if (returnVal == null) {
				throw new RuntimeException(var + ": Variable not declared");
			}
		}
		return returnVal;

	}

	private static void doMathOp(String opName, String params) throws RuntimeException {
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.valueMap.size();
		Map<String, Object> valMap = entry.valueMap.get(scope);
		String[] paramArr = getParams(params);
		String varName = paramArr[0].trim();
		Integer val1;
		Integer val2;
		String opr1 = paramArr[1].trim();
		String opr2 = paramArr[2].trim();
		if (opr1.matches("^\\d+$")) {
			val1 = Integer.parseInt(opr1);
		} else {
			val1 = (Integer) getValue(opr1);
		}
		if (opr2.matches("^\\d+$")) {
			val2 = Integer.parseInt(opr2);
		} else {
			val2 = (Integer) getValue(opr2);
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
		}

	}

	private static String[] getParams(String params) {
		return params.split(",");
	}

	public static Object getParsedValue(String value) throws RuntimeException {
		Object val = null;
		if ("POP()".equals(value)) {
			return Runtime.returnValStack.pop();
		}
		if (value.matches("^\\d+$")) {
			val = Integer.parseInt(value);
		} else if (value.matches("T|F")) {
			val = (value == "T") ? true : false;
		} else if (value.matches("\".*\"")) {
			val = value.substring(1, value.length() - 1);
		} else {
			val = getValue(value);
		}
		return val;
	}

}
