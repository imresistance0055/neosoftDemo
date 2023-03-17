package com.smart.customException;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorResponse<T> {
	private List<T> errors = new ArrayList<>(1);
	
	public ErrorResponse(List<T> errors) {
		this.errors = errors;
	}
	
	public List<T> getErrors() {
		return errors;
	}}