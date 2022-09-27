package com.sms.teacher.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.teacher.entity.Attendence;

public interface AttendenceRepository extends JpaRepository<Attendence,Long>{

	Optional<Attendence> findByIdContaining(long id);
}	