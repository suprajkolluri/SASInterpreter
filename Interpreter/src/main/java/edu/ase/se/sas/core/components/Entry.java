package edu.ase.se.sas.core.components;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * The Entry class is used to maintain a symbol table for every method.
 * 
 * Whenever a new method is invoked a new Entry is added onto the entry stack in
 * the runtime.
 *
 */
public class Entry {
	/**
	 * The Integer key in the symbol table stores the scope of a variable.
	 * 
	 * The Nested Map maintains the variable to value mapping for every scope.
	 */
	public Map<Integer, Map<String, Object>> symbolTable = new HashMap<Integer, Map<String, Object>>();
}
