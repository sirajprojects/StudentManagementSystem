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

import com.sms.admin.entity.NewTeacher;
import com.sms.admin.repository.NewTeacherRepository;
import com.sms.admin.services.AllTeacherExcelList;

@RestController
@RequestMapping("/admin")
public class TeacherController {

	@Autowired
	NewTeacherRepository newTeacherRepository;

	@Autowired
	AllTeacherExcelList allTeacherExcelList;

	@PostMapping("/newteacher")
	public ResponseEntity<NewTeacher> createTeacher(@RequestBody NewTeacher newTeacher) {
		try {
			NewTeacher _newTeacher = newTeacherRepository.save(new NewTeacher(newTeacher.getFirstname(),
					newTeacher.getLastname(), newTeacher.getBloodgroup(), newTeacher.getGender(),
					newTeacher.getFathername(), newTeacher.getMothername(), newTeacher.getDateofbirth(),
					newTeacher.getReligion(), newTeacher.getEmail(), newTeacher.getIsclass(), newTeacher.getAddres(),
					newTeacher.getIdno(), newTeacher.getPhone(), newTeacher.getAdress(), newTeacher.getSection()));
			return new ResponseEntity<>(_newTeacher, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

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

	@GetMapping("/getteacherdata")
	public ResponseEntity<InputStreamResource> getFile() {
		String filename = "teacherdata.xlsx";
		InputStreamResource file = new InputStreamResource(allTeacherExcelList.load());
		return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
				.contentType(MediaType.parseMediaType("application/vnd.ms-excel")).body(file);
	}

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
	public ResponseEntity<NewTeacher> updateTeacher(@PathVariable("id") long id, @RequestBody NewTeacher newTeacher) {
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
			newTeacher.setIsclass(newTeacher.getIsclass());
			newTeacher.setAddres(newTeacher.getAddres());
			newTeacher.setIdno(newTeacher.getIdno());
			newTeacher.setPhone(newTeacher.getPhone());
			newTeacher.setAdress(newTeacher.getAdress());

			newTeacher.setSection(newTeacher.getSection());

			return new ResponseEntity<>(newTeacherRepository.save(_teachers), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
