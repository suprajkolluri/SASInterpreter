package edu.ase.se.sas.exceptions;

public class RuntimeException extends Exception {

	private static final long serialVersionUID = 6861410246263651924L;

	public RuntimeException() {
		super();
	}

	public RuntimeException(String message) {
		super(message);
	}

	public RuntimeException(Throwable cause) {
		super(cause);
	}

	public RuntimeException(String message, Throwable cause) {
		super(message, cause);
	}

}
