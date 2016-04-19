package edu.ase.se.sas.core.utilities;

import java.util.HashMap;
import java.util.Map;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.RuntimeException;

public enum NativeMethodExecutor implements INativeMethodExecutor {

	PRINT {
		@Override
		public void execute(String params) throws RuntimeException {
			if (params.startsWith("\"") && params.endsWith("\"")) {
				System.out.print(params.substring(1, params.length() - 1));
			} else {
				System.out.print(getValue(params));
			}
		}
	},
	PRINTLN {
		@Override
		public void execute(String params) throws RuntimeException {
			if (params.startsWith("\"") && params.endsWith("\"")) {
				System.out.println(params.substring(1, params.length() - 1));
			} else {
				System.out.println(getValue(params));
			}
		}
	},
	STORE {
		@Override
		public void execute(String params) throws RuntimeException {
			String[] paramArr = params.split(",");
			String varName = paramArr[0].trim();
			String value = paramArr[1].trim();
			Object val = null;
			if (value.matches("^\\d+$")) {
				val = Integer.parseInt(value);
			} else if (value.matches("T|F")) {
				val = (value == "T") ? true : false;
			} else if (value.matches("\".*\"")) {
				val = value.substring(1, value.length() - 1);
			} else {
				val = getValue(value);
			}

			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			entry.valueMap.get(scope).put(varName, val);
		}
	},
	ADD {
		@Override
		public void execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			Map<String, Object> valMap = entry.valueMap.get(scope);
			String[] paramArr = params.split(",");
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

			valMap.put(varName, val1 + val2);
		}
	},
	BSTART {
		@Override
		public void execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			entry.valueMap.put(scope + 1, new HashMap<String, Object>());
		}
	},
	BEND {
		@Override
		public void execute(String params) throws RuntimeException {
			Entry entry = Runtime.entryStack.peek();
			int scope = entry.valueMap.size();
			entry.valueMap.remove(scope);
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

}
