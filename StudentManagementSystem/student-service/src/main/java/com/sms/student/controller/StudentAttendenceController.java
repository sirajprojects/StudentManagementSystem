package com.sms.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.student.entity.Attendence;
import com.sms.student.repository.AttendenceRepository;

@RestController
@RequestMapping("/student")
public class StudentAttendenceController {

	@Autowired
	AttendenceRepository attendenceRepository;

	@GetMapping("/attendence/{id}")
	public ResponseEntity<Attendence> getAttendeceById(@PathVariable("studentname") long id) {
		Optional<Attendence> attendenceData = attendenceRepository.findById(id);

		if (attendenceData.isPresent()) {
			return new ResponseEntity<>(attendenceData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
