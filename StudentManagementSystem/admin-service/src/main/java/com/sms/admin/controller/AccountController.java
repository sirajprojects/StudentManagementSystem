package com.sms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.NewAdmin;
import com.sms.admin.repository.AccountRepository;


@RestController
@RequestMapping("/admin")
public class AccountController {

	@Autowired
	AccountRepository accountRepository;

	@PostMapping("/account")
	public ResponseEntity<NewAdmin> createAccount(@RequestBody NewAdmin accountEntity) {
		try {
			
			NewAdmin accountNew = accountRepository.save(new NewAdmin(accountEntity.getFirstname(),
					accountEntity.getLastname(), accountEntity.getUsertype(), accountEntity.getGender(),
					accountEntity.getFathername(), accountEntity.getMothername(), accountEntity.getDateofbirth(),
					accountEntity.getReligion(), accountEntity.getJoiningdata(), accountEntity.getEmail(),
					accountEntity.getIdno(), accountEntity.getPhone(), accountEntity.getAdress()))	;
			return new ResponseEntity<>(accountNew, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
