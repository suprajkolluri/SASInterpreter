package edu.ase.se.sas.core.utilities;

import edu.ase.se.sas.exceptions.RuntimeException;

/**
 * 
 * The interface for NativeMethodExecutor class which describes an
 * {@link INativeMethodExecutor#execute(String)} method that every Opcode must
 * implement.
 *
 */
public interface INativeMethodExecutor {

	/**
	 * 
	 * @param params
	 *            The parameters to the OP code
	 * @return True if the next line must be executed.
	 * 
	 *         False if the control should go back to the calling function.
	 * @throws RuntimeException
	 *             When something goes during the code execution.
	 */
	public boolean execute(String params) throws RuntimeException;
}
