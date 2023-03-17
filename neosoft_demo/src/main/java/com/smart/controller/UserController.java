package com.smart.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smart.entity.User;
import com.smart.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/save")
	public ResponseEntity<Set<User>> save(@RequestBody User user) {
		//System.out.println(user.toString());
			return new ResponseEntity<>(service.save(user), HttpStatus.CREATED);

	}

	/*
	 * @GetMapping("{id}") public ResponseEntity<User> getById(@PathVariable("id")
	 * Integer id) throws FileNotFoundException { return new
	 * ResponseEntity<User>(service.findById(id), HttpStatus.OK); }
	 */
	

}


