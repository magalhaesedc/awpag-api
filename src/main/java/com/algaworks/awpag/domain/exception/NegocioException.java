package com.algaworks.awpag.domain.exception;

@SuppressWarnings("serial")
public class NegocioException extends RuntimeException {

	public NegocioException(String message) {
		super(message);
	}
	
}