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

import com.sms.admin.entity.StudentAdmitForm;
import com.sms.admin.repository.StudentAdmitRepository;


@RestController
@RequestMapping("/admin")
public class StudentProfileUpdateController {

	@Autowired
	StudentAdmitRepository studentAdmitRepository;
	

	@GetMapping("/studentdata/{id}")
	public ResponseEntity<StudentAdmitForm> getfindByTeacherId(@PathVariable("id") long id) {
		Optional<StudentAdmitForm> studentData = studentAdmitRepository.findById(id);

		if (studentData.isPresent()) {
			return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	

	@PutMapping("/studentdataupdate/{id}")
	public ResponseEntity<StudentAdmitForm> updateTutorial(@PathVariable("id") long id, @RequestBody StudentAdmitForm studentAdmitForm) {
		Optional<StudentAdmitForm> studentData = studentAdmitRepository.findById(id);

		if (studentData.isPresent()) {
			StudentAdmitForm _student = studentData.get();
			
			studentAdmitForm.setFirstname(studentAdmitForm.getFirstname());
			studentAdmitForm.setLastname(studentAdmitForm.getLastname());
			studentAdmitForm.setBloodgroup(studentAdmitForm.getBloodgroup());
			studentAdmitForm.setGender(studentAdmitForm.getGender());
			studentAdmitForm.setFathername(studentAdmitForm.getFathername());
			studentAdmitForm.setMothername(studentAdmitForm.getMothername());
			studentAdmitForm.setDateofbirth(studentAdmitForm.getDateofbirth());
			studentAdmitForm.setReligion(studentAdmitForm.getReligion());
			studentAdmitForm.setEmail(studentAdmitForm.getEmail());
			studentAdmitForm.setInclass(studentAdmitForm.getInclass());
			studentAdmitForm.setAdmissionId(studentAdmitForm.getAdmissionId());
			studentAdmitForm.setRoll(studentAdmitForm.getRoll());
			studentAdmitForm.setPhone(studentAdmitForm.getPhone());
			studentAdmitForm.setAdress(studentAdmitForm.getAdress());
			studentAdmitForm.setIsclass(studentAdmitForm.getIsclass());
			studentAdmitForm.setSection(studentAdmitForm.getSection());
			
			
			
			return new ResponseEntity<>(studentAdmitRepository.save(_student), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
