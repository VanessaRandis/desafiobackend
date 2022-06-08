package com.project.email.dtos;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.project.email.enums.StatusEmail;


public class EmailNewsDto {

	@NotBlank
	private Long emailId;
	@NotBlank
	private String emailFrom;
	@NotBlank
	private String emailTo;
	@NotBlank
	@Email
	private String subject;
	@Column(columnDefinition ="TEXT")
	@NotBlank
	private String text;
	@NotBlank
	private LocalDateTime sendDateEmail;
	@NotBlank
	private StatusEmail statusEmail;
	

}
