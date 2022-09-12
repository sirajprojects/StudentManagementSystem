package com.sms.teacher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.teacher.entity.StudentAdmitForm;



public interface StudentAdmitRepository extends JpaRepository<StudentAdmitForm,Long>{

	List<StudentAdmitForm> findByRollContaining(String roll);
}			