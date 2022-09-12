package com.sms.admin.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.admin.entity.NewTeacher;
import com.sms.admin.excel.AllTeachersData;
import com.sms.admin.repository.NewTeacherRepository;

@Service
public class AllTeacherExcelList {
	@Autowired
	NewTeacherRepository repository;

	public ByteArrayInputStream load() {
		List<NewTeacher> newTeacher = repository.findAll();
		ByteArrayInputStream in = AllTeachersData.TeachersdataToExcel(newTeacher);
		return in;
	}
}