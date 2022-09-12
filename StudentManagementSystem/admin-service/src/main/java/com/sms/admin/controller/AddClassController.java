package com.sms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.NewClassSchedule;
import com.sms.admin.repository.NewClassRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class AddClassController {

	@Autowired
	NewClassRepository newClassRepository;

	@PostMapping("/addclass")
	public ResponseEntity<NewClassSchedule> createTutorial(@RequestBody NewClassSchedule newClassSchedule) {
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

}
