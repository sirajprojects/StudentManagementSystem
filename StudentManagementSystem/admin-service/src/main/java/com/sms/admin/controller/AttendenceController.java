package com.sms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.Attendence;
import com.sms.admin.repository.AttendenceRepository;
import com.sms.admin.repository.StudentAdmitRepository;
import com.sms.admin.services.AttendanceStudentList;


@RestController
@RequestMapping("/admin")
public class AttendenceController {

	@Autowired
	StudentAdmitRepository studentattAdmitRepository;

	@Autowired
	AttendenceRepository attendenceRepository;

	@Autowired
	AttendanceStudentList attendanceStudentList;

	@PostMapping("/stattendence")
	public ResponseEntity<Attendence> attendendeAdd(@RequestBody Attendence attendence) {
		try {
			Attendence _attendence = attendenceRepository.save(new Attendence(null, null, null, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false));
			return new ResponseEntity<>(_attendence, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/getstudentattdata")
	public ResponseEntity<InputStreamResource> getFile() {
		String filename = "studentattdata.xlsx";
		InputStreamResource file = new InputStreamResource(attendanceStudentList.load());
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}
}
