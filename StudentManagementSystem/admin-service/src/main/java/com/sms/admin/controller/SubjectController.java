package com.sms.admin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.Subject;
import com.sms.admin.repository.SubjectRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class SubjectController {
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@PostMapping("/subjectdata")
	public ResponseEntity<Subject> createTutorial(@RequestBody Subject subject) {
		try {
			Subject _subject = subjectRepository
					.save(new Subject(
							subject.getSubjectname(),
							subject.getSubjecttype(),
							subject.getSelectclass(),
							subject.getSelectcode()
							));
			return new ResponseEntity<>(_subject, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}



	

	@GetMapping("/subjectdata/{id}")
	public ResponseEntity<Subject> getTutorialById(@PathVariable("id") long id) {
		Optional<Subject> subjectData = subjectRepository.findById(id);

		if (subjectData.isPresent()) {
			return new ResponseEntity<>(subjectData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	@GetMapping("/subjectdata")
	public ResponseEntity<List<Subject>> getAllTutorials(@RequestParam(required = false) String id) {
		try {
			List<Subject> subjects = new ArrayList<Subject>();

			if (id == null)
				subjectRepository.findAll().forEach(subjects::add);
			else
				subjectRepository.findByIdContaining(id).forEach(subjects::add);

			if (subjects.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(subjects, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
