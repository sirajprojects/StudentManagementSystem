package com.sms.login.services;

import com.sms.login.entity.User;

public interface UserService {

	public User createUser(User user);

	public boolean checkUsername(String username);

}