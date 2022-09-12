package com.sms.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.student.entity.Subject;



public interface SubjectRepository extends JpaRepository<Subject,Long>{

	List<Subject> findByIdContaining(String id);
}			