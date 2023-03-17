package com.smart.exceptionhandle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.UnexpectedTypeException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class GlobalExcption extends ResponseEntityExceptionHandler{
	
	
	@ExceptionHandler(ConstraintViolationException.class)
	protected ResponseEntity<?> handleConstraintViolationException(ConstraintViolationException ex, HttpServletRequest request) {
		try {
			List<String> messages = ex.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.toList());
			return new ResponseEntity<>(new ErrorResponse<>(messages), HttpStatus.BAD_REQUEST);
		} catch (Exception e) {
			return new ResponseEntity<>(new ErrorResponse<>(Arrays.asList(ex.getMessage())), HttpStatus.INTERNAL_SERVER_ERROR);
		}}
		
	

		    @ExceptionHandler(UnexpectedTypeException.class)
		    public ResponseEntity<String> handleUnexpectedTypeExceptionn(UnexpectedTypeException e) {
		        String message = "Salary must not be empty";
		        return new ResponseEntity<>(message, HttpStatus.BAD_REQUEST);
		    }

}
