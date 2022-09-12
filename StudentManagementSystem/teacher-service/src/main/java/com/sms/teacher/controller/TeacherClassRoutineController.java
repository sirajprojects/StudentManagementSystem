package com.sms.teacher.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.teacher.entity.ClassRoutine;
import com.sms.teacher.repository.ClassRoutineRepository;


@CrossOrigin(origins = "http://localhost:8085")
@RestController
@RequestMapping("/teacher")
public class TeacherClassRoutineController {

	
	@Autowired
	ClassRoutineRepository classRoutineRepository;
	
	@GetMapping("/routine/{id}")
	public ResponseEntity<ClassRoutine> getRoutineById(@PathVariable("id") long id) {
		Optional<ClassRoutine> routineClass = classRoutineRepository.findById(id);

		if (routineClass.isPresent()) {
			return new ResponseEntity<>(routineClass.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
