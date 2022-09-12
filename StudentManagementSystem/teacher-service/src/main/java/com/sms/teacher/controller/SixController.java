package com.sms.teacher.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sixcontroller")
public class SixController {

	@GetMapping("/message")
	public String test() {
		return "Hello JavaInUse Called in SixController";
	}
}	