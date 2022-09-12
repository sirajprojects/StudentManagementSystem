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

import com.sms.admin.entity.ClassRoutine;
import com.sms.admin.repository.ClassRoutineRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class ClassRoutineController {

	
	@Autowired
	ClassRoutineRepository classRoutineRepository;
	
	@PostMapping("/createroutine")
	public ResponseEntity<ClassRoutine> createRoutine(@RequestBody ClassRoutine classRoutine) {
		try {
			ClassRoutine _routine = classRoutineRepository
					.save(new 
							ClassRoutine(
									classRoutine.getSubjecttype(),
									classRoutine.getSelectclass(),
									classRoutine.getSelectcode(),
									classRoutine.getSubjectname()
									
									));
			return new ResponseEntity<>(_routine, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


	

	@GetMapping("/routine/{id}")
	public ResponseEntity<ClassRoutine> getRoutineById(@PathVariable("id") long id) {
		Optional<ClassRoutine> routineClass = classRoutineRepository.findById(id);

		if (routineClass.isPresent()) {
			return new ResponseEntity<>(routineClass.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	

	@GetMapping("/viewroutine")
	public ResponseEntity<List<ClassRoutine>> getAllRoutine(@RequestParam(required = false) String id) {
		try {
			List<ClassRoutine> routineclasses = new ArrayList<ClassRoutine>();

			if (id == null)
				classRoutineRepository.findAll().forEach(routineclasses::add);
			else
				classRoutineRepository.findByIdContaining(id).forEach(routineclasses::add);

			if (routineclasses.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(routineclasses, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
