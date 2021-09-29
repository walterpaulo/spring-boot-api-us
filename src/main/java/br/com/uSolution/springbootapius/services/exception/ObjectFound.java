package br.com.uSolution.springbootapius.services.exception;

public class ObjectFound extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ObjectFound(String msg) {
		super(msg);
	}

	public ObjectFound(String msg, Throwable er) {
		super(msg, er);
	}
}
