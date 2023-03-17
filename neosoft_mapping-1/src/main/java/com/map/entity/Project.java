package com.map.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="project_id")
	private int projectId;
	
	@NotEmpty(message = "First Name cannot be empty")
	@Column(name="project_name")
	private String projectName;
	
	@JsonFormat(pattern ="dd-mm-yyyy")
	private Date duration;
	
	@ManyToOne
	@JoinColumn(name="stud")
	@JsonBackReference
	private Student student;

	public Project(@NotEmpty(message = "First Name cannot be empty") String projectName, Date duration,
			Student student) {
		super();
		this.projectName = projectName;
		this.duration = duration;
		this.student = student;
	}
	
	
	

}
