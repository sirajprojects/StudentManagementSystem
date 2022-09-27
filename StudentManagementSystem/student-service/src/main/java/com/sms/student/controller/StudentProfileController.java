package com.sms.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.student.entity.StudentAdmitForm;
import com.sms.student.repository.StudentAdmitRepository;

@RestController
@RequestMapping("/student")
public class StudentProfileController {

	@Autowired
	StudentAdmitRepository studentAdmitRepository;

	@GetMapping("/studentdata/{id}")
	public ResponseEntity<StudentAdmitForm> getTutorialById(@PathVariable("id") long id) {
		Optional<StudentAdmitForm> studentData = studentAdmitRepository.findById(id);

		if (studentData.isPresent()) {
			return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
