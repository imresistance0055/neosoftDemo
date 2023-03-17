package com.map.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.map.dto.StudentDto;
import com.map.entity.Student;
import com.map.service.StudentService;

@RestController
@RequestMapping("/todo")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	
	@PostMapping("/save")
	public Student save(@RequestBody StudentDto studentdto) {
		
		return service.save(studentdto);
		
	}
	@GetMapping("/get")
	public List<Student> findAll(){
		return service.getAll();
		
	}
	

}
