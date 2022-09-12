package com.sms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.StudentAdmitForm;
import com.sms.admin.repository.StudentAdmitRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class AdmitFormController {

	@Autowired
	StudentAdmitRepository studentAdmitRepository;

	@PostMapping("/newstudent")
	public ResponseEntity<StudentAdmitForm> createTutorial(@RequestBody StudentAdmitForm studentAdmitForm) {
		try {
			StudentAdmitForm _admitForm = studentAdmitRepository.save(new StudentAdmitForm(
					studentAdmitForm.getFirstname(), studentAdmitForm.getLastname(), studentAdmitForm.getBloodgroup(),
					studentAdmitForm.getGender(), studentAdmitForm.getFathername(), studentAdmitForm.getMothername(),
					studentAdmitForm.getDateofbirth(), studentAdmitForm.getReligion(), studentAdmitForm.getEmail(),
					studentAdmitForm.getInclass(), studentAdmitForm.getAdmissionId(), studentAdmitForm.getRoll(),
					studentAdmitForm.getPhone(), studentAdmitForm.getAdress(), studentAdmitForm.getIsclass(),
					studentAdmitForm.getSection()));
			return new ResponseEntity<>(_admitForm, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
