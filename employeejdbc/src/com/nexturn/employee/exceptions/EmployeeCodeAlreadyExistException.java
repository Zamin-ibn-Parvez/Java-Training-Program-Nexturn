package com.nexturn.employee.exceptions;

@SuppressWarnings("serial")
public class EmployeeCodeAlreadyExistException extends RuntimeException{
	public EmployeeCodeAlreadyExistException() {
		super("Employee ID already exists enter another....");
	}
}
