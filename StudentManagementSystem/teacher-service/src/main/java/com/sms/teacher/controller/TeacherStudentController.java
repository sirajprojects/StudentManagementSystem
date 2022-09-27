package com.sms.teacher.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.teacher.entity.StudentAdmitForm;
import com.sms.teacher.repository.StudentAdmitRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherStudentController {

	@Autowired
	StudentAdmitRepository studentAdmitRepository;

	@GetMapping("/studentdata/{id}")
	public ResponseEntity<StudentAdmitForm> getStudentById(@PathVariable("id") long id) {
		Optional<StudentAdmitForm> studentData = studentAdmitRepository.findById(id);

		if (studentData.isPresent()) {
			return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/studentdata")
	public ResponseEntity<List<StudentAdmitForm>> getAllStudent(@RequestParam(required = false) String roll) {
		try {
			List<StudentAdmitForm> students = new ArrayList<StudentAdmitForm>();

			if (roll == null)
				studentAdmitRepository.findAll().forEach(students::add);
			else
				studentAdmitRepository.findByRollContaining(roll).forEach(students::add);

			if (students.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(students, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}