package com.sms.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.admin.entity.NewAdmin;



public interface AccountRepository extends JpaRepository<NewAdmin,Long>{

	List<NewAdmin> findByIdnoContaining(String idno);
}			