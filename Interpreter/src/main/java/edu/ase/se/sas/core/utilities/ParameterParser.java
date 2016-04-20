package edu.ase.se.sas.core.utilities;

import java.util.Map;

import edu.ase.se.sas.core.components.Entry;
import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * The ParameterParser contains methods that perform common functions.
 *
 */
public class ParameterParser {

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
			val = (value == "T") ? true : false;
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
	public static Object getValue(String var) throws RuntimeException {
		Object returnVal = null;
		Entry entry = Runtime.entryStack.peek();
		int scope = entry.symbolTable.size();
		while (scope >= 1) {
			Map<String, Object> map = entry.symbolTable.get(scope);
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
