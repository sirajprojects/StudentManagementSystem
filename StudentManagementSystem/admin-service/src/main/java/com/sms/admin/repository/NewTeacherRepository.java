package com.sms.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.admin.entity.NewTeacher;



public interface NewTeacherRepository extends JpaRepository<NewTeacher,Long>{

	List<NewTeacher> findByIdnoContaining(String idno);
}			