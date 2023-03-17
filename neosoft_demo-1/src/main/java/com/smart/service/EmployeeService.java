package com.smart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dao.EmployeeRepository;
import com.smart.entity.Employee;
import com.smart.exceptionhandle.EmptyDataException;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public Employee save(Employee emp) throws EmptyDataException {

		if (emp.getSalary() == 0) {
			throw new EmptyDataException("Salary should not be Empty");
		} else {
			return repository.save(emp);
		}

	}

	public List<Employee> getAll() {

		return repository.findAll();
	}

	/*
	 * public Employee getById(int id) {
	 * 
	 * return (Employee) repository.findById(id); }
	 */

	public List<Employee> getByDepartment(String department) {

		// repository.findByDepartment(department).stream().forEach(e ->
		// System.out.println(e.toString()));
		// return null;
		return repository.findByDepartment(department);
	}

	
	
	/*
	 * public List<Employee> updateSalaryById(int id, int salary) {
	 * 
	 * // repository.findByDepartment(department).stream().forEach(e -> //
	 * System.out.println(e.toString())); // return null; Employee
	 * emp=repository.getById(1); emp.setSalary(salary); return (List<Employee>)
	 * repository.save(emp); }
	 */

}
