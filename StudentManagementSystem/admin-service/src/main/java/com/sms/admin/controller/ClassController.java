package com.sms.admin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.NewClassSchedule;
import com.sms.admin.repository.NewClassRepository;

@RestController
@RequestMapping("/admin")
public class ClassController {

	@Autowired
	NewClassRepository newClassRepository;

	@PostMapping("/addclass")
	public ResponseEntity<NewClassSchedule> createClass(@RequestBody NewClassSchedule newClassSchedule) {
		try {
			NewClassSchedule _newClass = newClassRepository.save(new NewClassSchedule(newClassSchedule.getTeachername(),
					newClassSchedule.getIdno(), newClassSchedule.getGender(), newClassSchedule.getIsclass(),
					newClassSchedule.getSubject(), newClassSchedule.getSection(), newClassSchedule.getTime(),
					newClassSchedule.getDate(), newClassSchedule.getPhone(), newClassSchedule.getEmail()));
			return new ResponseEntity<>(_newClass, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/allclassdata/{id}")
	public ResponseEntity<NewClassSchedule> getClassById(@PathVariable("id") long id) {
		Optional<NewClassSchedule> classData = newClassRepository.findById(id);

		if (classData.isPresent()) {
			return new ResponseEntity<>(classData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/allclassdata")
	public ResponseEntity<List<NewClassSchedule>> getAllclassData(@RequestParam(required = false) String title) {
		try {
			List<NewClassSchedule> classes = new ArrayList<NewClassSchedule>();

			if (title == null)
				newClassRepository.findAll().forEach(classes::add);
			else
				newClassRepository.findByIdnoContaining(title).forEach(classes::add);

			if (classes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(classes, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
