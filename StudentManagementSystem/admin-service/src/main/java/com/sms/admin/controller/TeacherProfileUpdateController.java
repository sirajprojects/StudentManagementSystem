package com.sms.admin.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.NewTeacher;
import com.sms.admin.repository.NewTeacherRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class TeacherProfileUpdateController {
	
	@Autowired
	NewTeacherRepository newTeacherRepository;
	
	@GetMapping("/teacherdata/{id}")
	public ResponseEntity<NewTeacher> getTeachersById(@PathVariable("id") long id) {
		Optional<NewTeacher> teachersData = newTeacherRepository.findById(id);

		if (teachersData.isPresent()) {
			return new ResponseEntity<>(teachersData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	

	@PutMapping("/teacherdata/{id}")
	public ResponseEntity<NewTeacher> updateTutorial(@PathVariable("id") long id, @RequestBody NewTeacher newTeacher) {
		Optional<NewTeacher> teachersData = newTeacherRepository.findById(id);

		if (teachersData.isPresent()) {
			NewTeacher _teachers = teachersData.get();
			
			newTeacher.setFirstname(newTeacher.getFirstname());
			newTeacher.setLastname(newTeacher.getLastname());
			newTeacher.setBloodgroup(newTeacher.getBloodgroup());
			newTeacher.setGender(newTeacher.getGender());
			newTeacher.setFathername(newTeacher.getFathername());
			newTeacher.setMothername(newTeacher.getMothername());
			newTeacher.setDateofbirth(newTeacher.getDateofbirth());
			newTeacher.setReligion(newTeacher.getReligion());
			newTeacher.setEmail(newTeacher.getEmail());
			newTeacher.setInclass(newTeacher.getInclass());
			newTeacher.setAddres(newTeacher.getAddres());
			newTeacher.setIdno(newTeacher.getIdno());
			newTeacher.setPhone(newTeacher.getPhone());
			newTeacher.setAdress(newTeacher.getAdress());
			newTeacher.setIsclass(newTeacher.getIsclass());
			newTeacher.setSection(newTeacher.getSection());
			
			
			
			return new ResponseEntity<>(newTeacherRepository.save(_teachers), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	



}
