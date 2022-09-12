package com.sms.login.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/thirdcontroller")
public class ThirdController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in ThirdController";
	}
}		