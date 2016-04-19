package edu.ase.se.sas.exceptions;

public class FileReadException extends Exception {
	private static final long serialVersionUID = 5217521319441589270L;

	public FileReadException() {
		super();
	}

	public FileReadException(String message) {
		super(message);
	}

	public FileReadException(Throwable cause) {
		super(cause);
	}

	public FileReadException(String message, Throwable cause) {
		super(message, cause);
	}

}
