package edu.ase.se.sas.core.utilities;

import edu.ase.se.sas.exceptions.RuntimeException;

public interface INativeMethodExecutor {

	public boolean execute(String params) throws RuntimeException;
}
