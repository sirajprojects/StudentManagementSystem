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

import com.sms.admin.entity.NewTeacher;
import com.sms.admin.repository.NewTeacherRepository;
import com.sms.admin.services.AllTeacherExcelList;

@CrossOrigin(origins = "http://localhost:8090")
@RestController
@RequestMapping("/admin")
public class AllTeacherController {

	@Autowired
	NewTeacherRepository newTeacherRepository;

	@Autowired
	AllTeacherExcelList allTeacherExcelList;

	@GetMapping("/allteachers/{id}")
	public ResponseEntity<NewTeacher> getTeacherById(@PathVariable("id") long id) {
		Optional<NewTeacher> TeachersData = newTeacherRepository.findById(id);

		if (TeachersData.isPresent()) {
			return new ResponseEntity<>(TeachersData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/allteachers")
	public ResponseEntity<List<NewTeacher>> getAllTeachers(@RequestParam(required = false) String idno) {
		try {
			List<NewTeacher> teacher = new ArrayList<NewTeacher>();

			if (idno == null)
				newTeacherRepository.findAll().forEach(teacher::add);
			else
				newTeacherRepository.findByIdnoContaining(idno).forEach(teacher::add);

			if (teacher.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(teacher, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/allteachers/getteacherdata")
	public ResponseEntity<InputStreamResource> getFile() {
		String filename = "teacherdata.xlsx";
		InputStreamResource file = new InputStreamResource(allTeacherExcelList.load());
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}

}
