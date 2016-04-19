package edu.ase.se.sas.core;

import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.core.utilities.Loader;
import edu.ase.se.sas.exceptions.FileReadException;
import edu.ase.se.sas.exceptions.RuntimeException;

public class SASRunner {
	public static void main(String[] args) {
		String errorPrefix = "Unable to interpret the code, Reason: ";
		String fileName = "C:/eclipseworkspaces/SER502/Interpreter/src/main/resources/Scopes.sas";// args[0];
		try {
			Loader loader = new Loader(fileName);
			Runtime runtime = new Runtime();
			runtime.run(loader);
		} catch (FileReadException | RuntimeException e) {
			System.out.println(errorPrefix + e.getClass()+ " " + e.getMessage());
		}
	}
}
