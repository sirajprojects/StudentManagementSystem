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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.StudentAdmitForm;
import com.sms.admin.repository.StudentAdmitRepository;
import com.sms.admin.services.AllStudentExcelList;

@RestController
@RequestMapping("/admin")
public class StudentsController {

	@Autowired
	StudentAdmitRepository studentAdmitRepository;

	@Autowired
	AllStudentExcelList allStudentExcelList;

	@PostMapping("/newstudent")
	public ResponseEntity<StudentAdmitForm> createStudent(@RequestBody StudentAdmitForm studentAdmitForm) {
		try {
			StudentAdmitForm _admitForm = studentAdmitRepository.save(new StudentAdmitForm(
					studentAdmitForm.getFirstname(), studentAdmitForm.getLastname(), studentAdmitForm.getBloodgroup(),
					studentAdmitForm.getGender(), studentAdmitForm.getFathername(), studentAdmitForm.getMothername(),
					studentAdmitForm.getDateofbirth(), studentAdmitForm.getReligion(), studentAdmitForm.getEmail(),
					studentAdmitForm.getSection(), studentAdmitForm.getAdmissionid(), studentAdmitForm.getRoll(),
					studentAdmitForm.getPhone(), studentAdmitForm.getAddress(), studentAdmitForm.getIsclass()));
			return new ResponseEntity<>(_admitForm, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

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
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}

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
	public ResponseEntity<StudentAdmitForm> updateTutorial(@PathVariable("id") long id,
			@RequestBody StudentAdmitForm studentAdmitForm) {
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
			studentAdmitForm.setIsclass(studentAdmitForm.getIsclass());
			studentAdmitForm.setAdmissionid(studentAdmitForm.getAdmissionid());
			studentAdmitForm.setRoll(studentAdmitForm.getRoll());
			studentAdmitForm.setPhone(studentAdmitForm.getPhone());
			studentAdmitForm.setAddress(studentAdmitForm.getAddress());
			studentAdmitForm.setIsclass(studentAdmitForm.getIsclass());
			studentAdmitForm.setSection(studentAdmitForm.getSection());

			return new ResponseEntity<>(studentAdmitRepository.save(_student), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}