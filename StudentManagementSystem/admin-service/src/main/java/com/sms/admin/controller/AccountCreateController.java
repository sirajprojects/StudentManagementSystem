package com.sms.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sms.admin.entity.AccountEntity;
import com.sms.admin.repository.AccountRepository;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class AccountCreateController {

	@Autowired
	AccountRepository accountRepository;

	@PostMapping("/account")
	public ResponseEntity<AccountEntity> createTutorial(@RequestBody AccountEntity accountEntity) {
		try {
			AccountEntity _account = accountRepository.save(new AccountEntity(accountEntity.getFirstname(),
					accountEntity.getLastname(), accountEntity.getUsertype(), accountEntity.getGender(),
					accountEntity.getFathername(), accountEntity.getMothername(), accountEntity.getDateofbirth(),
					accountEntity.getReligion(), accountEntity.getJoiningdata(), accountEntity.getEmail(),
					accountEntity.getSubject(), accountEntity.getInclass(), accountEntity.getSection(),
					accountEntity.getIdno(), accountEntity.getPhone(), accountEntity.getAdress()));
			return new ResponseEntity<>(_account, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
