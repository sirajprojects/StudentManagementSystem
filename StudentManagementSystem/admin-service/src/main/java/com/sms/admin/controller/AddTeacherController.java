package com.sms.admin.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.NewTeacher;
import com.sms.admin.repository.NewTeacherRepository;


@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class AddTeacherController {
	
	
	@Autowired
	NewTeacherRepository newTeacherRepository;
	
	
	@PostMapping("/newteacher")
	public ResponseEntity<NewTeacher> createTutorial(@RequestBody NewTeacher newTeacher) {
		try {
			NewTeacher _newTeacher = newTeacherRepository
					.save(new NewTeacher(
							 newTeacher.getFirstname(),
							 newTeacher.getLastname(),
							 newTeacher.getBloodgroup(),
							 newTeacher.getGender(),
							 newTeacher.getFathername(),
							 newTeacher.getMothername(),
							 newTeacher.getDateofbirth(),
							 newTeacher.getReligion(),
							 newTeacher.getEmail(),
							 newTeacher.getInclass(),
							 newTeacher.getAddres(),
							 newTeacher.getIdno(),
							 newTeacher.getPhone(),
							 newTeacher.getAdress(),
							 newTeacher.getIsclass(),
							 newTeacher.getSection()
							));
			return new ResponseEntity<>(_newTeacher, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}


}
