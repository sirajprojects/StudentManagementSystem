package com.sms.student.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.student.entity.Attendence;

public interface AttendenceRepository extends JpaRepository<Attendence,Long>{

	Optional<Attendence> findByStudentNameContaining(String studentname);
}	