package com.smart.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Entity
@Data
@AllArgsConstructor
@Table(name="userDetails")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "User name cannot be empty")
	@Column(name="user_name",unique = true)
	@Pattern(regexp="^[a-zA-Z\\s]*$" , message="only Aplphabetical allows")
	private String userName;
	
	@Email(message = "Email is not valid")
	@NotEmpty(message = "Email cannot be empty")
	@Column(name="email_id",unique = true)
	private String emailId;
	
	@NotEmpty(message = "Mobile number cannot be empty")
	@Column(unique = true)
	@Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digit")
	private String mobile;

}
