package com.sms.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.admin.entity.StudentAdmitForm;



public interface StudentAdmitRepository extends JpaRepository<StudentAdmitForm,Long>{

	List<StudentAdmitForm> findByRollContaining(String roll);
}			