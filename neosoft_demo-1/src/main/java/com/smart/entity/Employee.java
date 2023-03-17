package com.smart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "empldetails")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name="EmployeeDetails")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "First Name cannot be empty")
	@Column(name="first_name")
	@Pattern(regexp="^[a-zA-Z\\s]*$" , message="only Aplphabetical allows")
	private String firstName;
	
	@NotNull(message = "Salary cannot be empty")
	@Column(name="salary")
	
	private int salary;
	
	@NotEmpty(message = "City cannot be empty")
	@Column(name="city")
	private String city;
	
	@NotEmpty(message = "department cannot be empty")
	@Column(name="department")
	private String department;

}
