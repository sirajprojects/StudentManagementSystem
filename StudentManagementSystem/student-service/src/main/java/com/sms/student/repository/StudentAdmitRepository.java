package com.sms.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.student.entity.StudentAdmitForm;



public interface StudentAdmitRepository extends JpaRepository<StudentAdmitForm,Long>{

	List<StudentAdmitForm> findByRollContaining(String roll);
}			