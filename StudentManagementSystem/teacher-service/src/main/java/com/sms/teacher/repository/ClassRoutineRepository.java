package com.sms.teacher.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.teacher.entity.ClassRoutine;

public interface ClassRoutineRepository extends JpaRepository<ClassRoutine,Long>{

	List<ClassRoutine> findByIdContaining(String id);
}	