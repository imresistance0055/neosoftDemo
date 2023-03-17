package com.smart.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smart.dao.UserRepository;
import com.smart.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public Set<User> save(User user) {

		Set<User> list = new HashSet<>();

		repository.save(user);
		
		

		return list;
	}
}
