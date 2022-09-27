package com.sms.login.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sms.login.entity.User;
import com.sms.login.repository.UserRepository;



@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private UserRepository userRepo;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String username = p.getName();
		User user = userRepo.findByUsername(username);

		m.addAttribute("user", user);

	}

	@GetMapping("/")
	public String home() {
		return "student/home";
	}

}