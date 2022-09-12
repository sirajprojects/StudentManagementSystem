package com.sms.admin.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.admin.entity.Attendence;
import com.sms.admin.excel.AttendanceStudentsInExcel;
import com.sms.admin.repository.AttendenceRepository;

@Service
public class AttendanceStudentList {
  @Autowired
  AttendenceRepository repository;
  public ByteArrayInputStream load() {
    List<Attendence> attendences = repository.findAll();
    ByteArrayInputStream in = AttendanceStudentsInExcel.AttendanceToExcel(attendences);
    return in;
  }
}