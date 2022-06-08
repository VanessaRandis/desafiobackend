package com.project.email.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.stereotype.Service;

import com.project.email.enums.StatusEmail;
import com.project.email.models.EmailNewsModel;
import com.project.email.repositories.EmailRepository;

@Service
public class EmailNewsService {
	
	@Autowired
	EmailRepository emailRepository;
	
	public EmailNewsModel sendEmail(EmailNewsModel emailNewsModel) {
		emailNewsModel.setSendDateEmail(LocalDateTime.now());
		try {
			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom(emailNewsModel.getEmailFrom());
			message.setTo(emailNewsModel.getEmailTo());
			message.setSubject(emailNewsModel.getSubject());
			message.setText(emailNewsModel.getText());
			
			emailNewsModel.setStatusEmail(StatusEmail.PROCESS);
		}
		
		catch(MailException e){
			emailNewsModel.setStatusEmail(StatusEmail.UNPROCESS);
			
		}
		return emailRepository.save(emailNewsModel);
	}

}
