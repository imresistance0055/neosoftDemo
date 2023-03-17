package com.smart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.Employee;
import com.smart.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/todo")
	public ResponseEntity<Employee> save(@RequestBody Employee empl) {
		return new ResponseEntity<>(service.save(empl), HttpStatus.CREATED);

	}

	@GetMapping("/todo")
	public List<Employee> getAll() {

		return service.getAll();
	}

	/*
	 * @GetMapping("/todo/{department}") public ResponseEntity<Employee>
	 * getByDepartment(@PathVariable String department) throws FileNotFoundException
	 * { return new ResponseEntity<Employee>((Employee)
	 * service.getByDepartment(department), HttpStatus.OK);
	 * 
	 * }
	 */
	@GetMapping("/todo/{department}")
	public List<Employee> getByDepartment(@PathVariable String department) {

		return service.getByDepartment(department);
	}

	/*
	 * @PutMapping("/todo/{id}") public ResponseEntity<Employee>
	 * updateById(@RequestBody Employee emp) throws FileNotFoundException { return
	 * new ResponseEntity<Employee>((Employee) service.save(emp), HttpStatus.OK);
	 * 
	 * }
	 */
	@PutMapping("/todo")
	public Employee update(@RequestBody Employee employee) {
		return service.save(employee);
	}

	@PatchMapping("todo/{id}")
	public Employee updatePartially(@PathVariable(name = "id") int id, @RequestBody Employee empl) {

		return service.save(empl);

	}
}