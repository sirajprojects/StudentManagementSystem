package com.sms.admin.services;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.admin.entity.StudentAdmitForm;
import com.sms.admin.excel.AllStudentData;
import com.sms.admin.repository.StudentAdmitRepository;

@Service
public class AllStudentExcelList {
  @Autowired
  StudentAdmitRepository repository;
  public ByteArrayInputStream load() {
    List<StudentAdmitForm> studentAdmitForm = repository.findAll();
    ByteArrayInputStream in = AllStudentData.StudentsdataToExcel(studentAdmitForm);
    return in;
  }
}