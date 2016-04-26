package edu.ase.se.sas.core;

import edu.ase.se.sas.core.runtime.Runtime;
import edu.ase.se.sas.core.utilities.Loader;
import edu.ase.se.sas.exceptions.FileReadException;
import edu.ase.se.sas.exceptions.RuntimeException;

public class SASRunnerTest {

	public static void main(String[] args) {
		String errorPrefix = "Unable to interpret the code, Reason: ";
		String fileName = "C:/Users/Supraj/git/SASInterpreter/Interpreter/src/main/resources/sas/ReadFromConsole.SAS";// args[0];
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
