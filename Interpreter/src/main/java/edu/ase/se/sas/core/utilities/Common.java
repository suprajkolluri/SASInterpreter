package edu.ase.se.sas.core.utilities;

import java.util.Map;
import java.util.Stack;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * The Common class contains methods that perform common functions.
 *
 */
public class Common {

	/**
	 * Returns the parameters in a String array.
	 * 
	 * @param params
	 *            The parameter of the opcode.
	 * @return The string array of the parameters.
	 */
	public static String[] getParams(String params) {
		return params.split(",");
	}

	/**
	 * 
	 * @param value
	 *            The variable name or the value.
	 * @return The value of the variable.
	 * @throws RuntimeException
	 *             When something goes wrong during the program execution.
	 */
	public static Object getParsedValue(String value) throws RuntimeException {
		Object val = null;
		if ("POP()".equals(value)) {
			return Runtime.returnValStack.pop();
		}
		if (value.matches("^\\d+$")) {
			val = Integer.parseInt(value);
		} else if (value.matches("T|F")) {
			val = (value.equals("T")) ? true : false;
		} else if (value.matches("\".*\"")) {
			val = value.substring(1, value.length() - 1);
		} else {
			val = getValue(value);
		}
		return val;
	}

	/**
	 * 
	 * @param var
	 *            The variable name or the value.
	 * @return The value of the variable is searched in the current scope, if it
	 *         is not found it is searched in the previous scopes and finally in
	 *         the {@link Runtime#globalVarMap}.
	 * @throws RuntimeException
	 *             When something goes wrong during the program execution.
	 */
	@SuppressWarnings("rawtypes")
	public static Object getValue(String var) throws RuntimeException {
		Object returnVal = null;
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.symbolTable.size();
		while (scope >= 1) {
			Map<String, Object> map = entry.symbolTable.get(scope);
			if (map.containsKey(var)) {
				returnVal = map.get(var);
				if (returnVal instanceof Stack) {
					Stack stack = (Stack) returnVal;
					returnVal = stack.pop();
				}
				break;
			} else {
				scope--;
			}
		}
		if (returnVal == null) {
			returnVal = Runtime.globalVarMap.get(var);
			if (returnVal == null) {
				throw new RuntimeException(var + ": Variable not declared");
			} else if (returnVal instanceof Stack) {
				Stack stack = (Stack) returnVal;
				returnVal = stack.pop();
			}
		}
		return returnVal;

	}

	/**
	 * Searches for the variable and stores its value in that scope.
	 * 
	 * @param var
	 *            The name of the variable.
	 * @param val
	 *            The value to be stored in the variable.
	 * @throws RuntimeException
	 *             When something goes wrong during the program execution.
	 */
	public static void storeValue(String var, Object val) throws RuntimeException {
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.symbolTable.size();
		if (var.startsWith("$")) {
			Map<String, Object> map = entry.symbolTable.get(scope);
			map.put(var, val);
		} else {
			while (scope >= 1) {
				Map<String, Object> map = entry.symbolTable.get(scope);
				if (map.containsKey(var)) {
					Object obj = map.get(var);
					if (obj instanceof Stack) {
						pushValToStack(obj, val);
					} else {
						map.put(var, val);
					}
					break;
				} else {
					scope--;
				}
			}
			if (scope == 0) {
				if (!Runtime.globalVarMap.containsKey(var)) {
					throw new RuntimeException(var + ": Variable not declared");
				}
				Object obj = Runtime.globalVarMap.get(var);
				if (obj instanceof Stack) {
					pushValToStack(obj, val);
				} else {
					Runtime.globalVarMap.put(var, val);
				}
			}
		}

	}

	/**
	 * Determines the type of the value
	 * 
	 * @param val
	 *            The object value
	 * @return The type of the object
	 */
	private static String getType(Object val) {
		String type = "";
		if (val instanceof String) {
			type = "String";
		} else if (val instanceof Boolean) {
			type = "Boolean";
		} else if (val instanceof Integer) {
			type = "Integer";
		}
		return type;

	}

	/**
	 * Pushes a value to the object
	 * 
	 * @param obj
	 *            The stack object
	 * @param val
	 *            The value to push in the stack
	 */
	@SuppressWarnings("unchecked")
	private static void pushValToStack(Object obj, Object val) {

		String type = getType(val);
		switch (type) {
		case "Integer":
			Stack<Integer> intStack = (Stack<Integer>) obj;
			intStack.push((Integer) val);
			break;
		case "Boolean":
			Stack<Boolean> boolStack = (Stack<Boolean>) obj;
			boolStack.push((Boolean) val);
			break;
		case "String":
			Stack<String> strStack = (Stack<String>) obj;
			strStack.push((String) val);
			break;
		}
	}

}
