package com.alessandrozaros.course.services.exceptions;


//Exceção que será lançada quando for informado um id inexistente para busca , ou atualização.
public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super("Resurce not found. Id " + id);
	}

}
