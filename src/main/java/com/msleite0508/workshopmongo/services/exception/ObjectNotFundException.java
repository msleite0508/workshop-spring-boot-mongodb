package com.msleite0508.workshopmongo.services.exception;

public class ObjectNotFundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ObjectNotFundException(String msg) {
		super(msg);
	}
}
