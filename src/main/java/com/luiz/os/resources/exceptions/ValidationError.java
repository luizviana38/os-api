package com.luiz.os.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.mapping.Array;

public class ValidationError extends StandardError{
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessade> erros = new ArrayList<>();

	public ValidationError() {
		super();
	}

	public ValidationError(Long timestemp, Integer status, String error) {
		super(timestemp, status, error);
	}

	public List<FieldMessade> getErros() {
		return erros;
	}

	public void addErro(String fieldName,String messade) {
		this.erros.add(new FieldMessade(fieldName, messade));
	}
	
	

}
