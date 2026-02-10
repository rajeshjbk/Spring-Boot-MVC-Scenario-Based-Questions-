package com.raj.exception;

public class StudentNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public StudentNotFoundException() {
		super();
	}
	
	public StudentNotFoundException(String msg) {
		super(msg);
	}

}
