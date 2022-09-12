package com.sms.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.admin.entity.NewClassSchedule;



public interface NewClassRepository extends JpaRepository<NewClassSchedule,Long>{

	List<NewClassSchedule> findByIdContaining(String id);
}			