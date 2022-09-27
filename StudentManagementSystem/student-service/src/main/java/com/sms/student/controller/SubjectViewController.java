package com.sms.student.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.student.entity.Subject;
import com.sms.student.repository.SubjectRepository;

@RestController
@RequestMapping("/student")
public class SubjectViewController {

	@Autowired
	SubjectRepository subjectRepository;

	@GetMapping("/subjectdata/{id}")
	public ResponseEntity<Subject> getTutorialById(@PathVariable("id") long id) {
		Optional<Subject> subjectData = subjectRepository.findById(id);

		if (subjectData.isPresent()) {
			return new ResponseEntity<>(subjectData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
