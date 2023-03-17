package com.map.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotEmpty(message = "First Name cannot be empty")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "only Aplphabetical allows")
	private String firstName;

	@NotEmpty(message = "Last Name cannot be empty")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "only Aplphabetical allows")
	private String lastName;

	@NotEmpty
	private String mobile;
	
	@OneToMany(mappedBy = "student", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	
	private List<Project> project;

}
