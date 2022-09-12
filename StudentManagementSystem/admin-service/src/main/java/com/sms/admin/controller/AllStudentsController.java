package com.sms.admin.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.StudentAdmitForm;
import com.sms.admin.repository.StudentAdmitRepository;
import com.sms.admin.services.AllStudentExcelList;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class AllStudentsController {


	@Autowired
	StudentAdmitRepository studentAdmitRepository;
	
	@Autowired
	AllStudentExcelList allStudentExcelList;


	@GetMapping("/allstudentdata/{id}")
	public ResponseEntity<StudentAdmitForm> getStudentById(@PathVariable("id") long id) {
		Optional<StudentAdmitForm> studentData = studentAdmitRepository.findById(id);

		if (studentData.isPresent()) {
			return new ResponseEntity<>(studentData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
	@GetMapping("/allstudentdata")
	public ResponseEntity<List<StudentAdmitForm>> getAllStudent(@RequestParam(required = false) String roll) {
		try {
			List<StudentAdmitForm> students = new ArrayList<StudentAdmitForm>();

			if (roll == null)
				studentAdmitRepository.findAll().forEach(students::add);
			else
				studentAdmitRepository.findByRollContaining(roll).forEach(students::add);

			if (students.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(students, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

	@GetMapping("/getstudentdata")
	  public ResponseEntity<InputStreamResource> getFile() {
	    String filename = "studentdata.xlsx";
	    InputStreamResource file = new InputStreamResource(allStudentExcelList.load());
	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
	        .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
	        .body(file);
	  }
	}