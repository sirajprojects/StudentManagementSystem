package com.sms.login.repository;

import org.springframework.data.repository.CrudRepository;

import com.sms.login.entity.User;
 
public interface UserRepository extends CrudRepository<User, Long> {
 

	public boolean existsByUsername(String username);

	public User findByUsername(String username);

}