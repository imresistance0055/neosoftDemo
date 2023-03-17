package com.map.dto;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProjectDto {

	private int projectId;

	@NotEmpty(message = "First Name cannot be empty")

	private String projectName;

	@JsonFormat(pattern = "dd-mm-yyyy")
	private Date duration;

}
