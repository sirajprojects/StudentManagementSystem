package com.sms.admin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.admin.entity.Attendence;

public interface AttendenceRepository extends JpaRepository<Attendence,Long>{

	Optional<Attendence> findByIdContaining(long id);
}	