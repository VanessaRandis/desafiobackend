package com.project.email.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.email.dtos.EmailNewsDto;
import com.project.email.models.EmailNewsModel;
import com.project.email.services.EmailNewsService;

@RestController
public class EmailController {
	
	@Autowired
	EmailNewsService emailNewsService;
	
	@PostMapping("/sending-email")
	public ResponseEntity<EmailNewsModel> sendingEmail(@RequestBody @Valid EmailNewsDto emailNewsDto){
		EmailNewsModel emailNewsModel = new EmailNewsModel();
		BeanUtils.copyProperties(emailNewsDto, emailNewsModel);
		emailNewsService.sendEmail(emailNewsModel);
		return new ResponseEntity<>(emailNewsModel, HttpStatus.CREATED);
	}

}
