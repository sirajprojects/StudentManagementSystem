package com.sms.student.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fourcontroller")
public class FourController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in FourController";
	}
}	