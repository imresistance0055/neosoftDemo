
package com.map.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.map.entity.Project;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data

@AllArgsConstructor

@NoArgsConstructor

@ToString
public class StudentDto {

	

	@NotEmpty(message = "First Name cannot be empty")
	@Column(name = "first_name")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "only Aplphabetical allows")
	private String firstName;

	@NotEmpty(message = "Last Name cannot be empty")
	@Column(name = "last_name")
	@Pattern(regexp = "^[a-zA-Z\\s]*$", message = "only Aplphabetical allows")
	private String lastName;

	@NotEmpty
	private String mobile;

	private List<ProjectDto> project;

}
