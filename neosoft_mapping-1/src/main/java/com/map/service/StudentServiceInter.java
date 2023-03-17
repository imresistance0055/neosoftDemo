package com.map.service;

import java.util.List;

import com.map.entity.Student;

public interface StudentServiceInter {
	
	public Student save(Student student);
	
	public List<Student> getAll();

}
