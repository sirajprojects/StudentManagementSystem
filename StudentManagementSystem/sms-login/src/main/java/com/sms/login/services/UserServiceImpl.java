package com.sms.login.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sms.login.entity.User;
import com.sms.login.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncode;

	@Override
	public User createUser(User user) {

		user.setPassword(passwordEncode.encode(user.getPassword()));
		user.setRole("ROLE_ADMIN");

		return userRepo.save(user);
	}

	@Override
	public boolean checkUsername(String username) {

		return userRepo.existsByUsername(username);
	}

}