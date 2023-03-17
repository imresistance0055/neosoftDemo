package com.smart.service;

import java.util.List;

import com.smart.entity.Employee;
import com.smart.exceptionhandle.EmptyDataException;

public interface EmployeeServiceInt {
	
	
	public List<Employee> getByDepartment(String department);
	public List<Employee> getAll();
	public Employee save(Employee emp) throws EmptyDataException;

}
