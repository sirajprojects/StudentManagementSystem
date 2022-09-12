package com.sms.teacher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.teacher.entity.NewTeacher;



public interface NewTeacherRepository extends JpaRepository<NewTeacher,Long>{

	List<NewTeacher> findByIdnoContaining(String idno);
}			