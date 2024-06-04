package com.app.custom_exceptions;

@SuppressWarnings("serial")
public class PenException extends Exception {
	public PenException(String mesg) {
		super(mesg);
	}
}
