package com.smart.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.smart.entity.Employee;

public interface EmployeeControllerInter {

	public ResponseEntity<Employee> save(@RequestBody Employee empl);

	public List<Employee> getAll();

	public List<Employee> getByDepartment(@PathVariable String department);

	public Employee update(@RequestBody Employee employee);

}
