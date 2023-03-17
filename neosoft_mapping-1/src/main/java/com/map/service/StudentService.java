package com.map.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.map.dao.StudentRepository;
import com.map.dto.ProjectDto;
import com.map.dto.StudentDto;
import com.map.entity.Project;
import com.map.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;

	public Student save(StudentDto studentdto) {

		//List<Student> list = new ArrayList<>();
		
		Student student=new Student();
		
		
		student.setFirstName(studentdto.getFirstName());
		student.setLastName(studentdto.getLastName());
		student.setMobile(studentdto.getMobile());
		
		List<Project> list1=new ArrayList<>();
		
		List<ProjectDto>list2=  studentdto.getProject();
		
		for(ProjectDto dto: list2)
			list1.add(new Project(dto.getProjectName(),dto.getDuration(),student));
			
		student.setProject(list1);
		

		return repo.save(student);
	}

	public List<Student> getAll() {

		return repo.findAll();
	}

}
