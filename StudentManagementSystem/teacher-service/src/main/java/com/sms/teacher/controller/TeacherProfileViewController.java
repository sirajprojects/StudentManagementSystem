package com.sms.teacher.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.teacher.entity.NewTeacher;
import com.sms.teacher.repository.NewTeacherRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherProfileViewController {

	@Autowired
	NewTeacherRepository newTeacherRepository;

	@GetMapping("/tutorials/{id}")
	public ResponseEntity<NewTeacher> getTutorialById(@PathVariable("id") long id) {
		Optional<NewTeacher> teacherData = newTeacherRepository.findById(id);

		if (teacherData.isPresent()) {
			return new ResponseEntity<>(teacherData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
