package edu.ase.se.sas.core;

import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.core.utilities.Loader;
import edu.ase.se.sas.exceptions.FileReadException;
import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * SASRunner is the entry point of the interpreter, which loads and runs the SAS
 * intermediate code.
 * 
 * The name of the file to be interpreted must be passed as the first java
 * command line argument.
 *
 */
public class SASRunner {
	public static void main(String[] args) {
		String errorPrefix = "Unable to interpret the code, Reason: ";
		String fileName = args[0];
		try {
			Loader loader = new Loader(fileName);
			Runtime.run(loader);
		} catch (FileReadException | RuntimeException e) {
			System.out.println(errorPrefix + e.getClass() + " " + e.getMessage() + " " + e.getCause());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(errorPrefix + e.getClass() + " " + e.getMessage() + " " + e.getCause());
			e.printStackTrace();
		}

	}
}
