package com.sms.teacher.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.teacher.entity.Attendence;
import com.sms.teacher.repository.AttendenceRepository;

@RestController
@RequestMapping("/teacher")
public class StudentAttendenceController {

	@Autowired
	AttendenceRepository attendenceRepository;

	@PostMapping("/attendence")
	public ResponseEntity<Attendence> attendendeAdd(@RequestBody Attendence attendence) {
		try {
			Attendence _attendence = attendenceRepository
					.save(new Attendence(null, null, null, null, null, false, false, false, false, false, false, false,
							false, false, false, false, false, false, false, false, false, false, false, false, false,
							false, false, false, false, false, false, false, false, false, false, false));
			return new ResponseEntity<>(_attendence, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

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
