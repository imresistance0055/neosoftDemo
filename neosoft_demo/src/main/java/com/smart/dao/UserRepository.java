package com.smart.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smart.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	
	List<User> findById(int id);
	List<User> findByUserName(String userName);
	List<User> findByEmailId(String emailId);
	List<User> findByMobile(String mobile);

}
