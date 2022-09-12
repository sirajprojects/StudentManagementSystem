package com.sms.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sms.admin.entity.AccountEntity;



public interface AccountRepository extends JpaRepository<AccountEntity,Long>{

	List<AccountEntity> findByIdnoContaining(String idno);
}			