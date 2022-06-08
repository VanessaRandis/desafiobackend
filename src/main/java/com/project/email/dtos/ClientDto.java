package com.project.email.dtos;



import javax.validation.constraints.NotBlank;



public class ClientDto {

	@NotBlank
	private Long Id;
	@NotBlank
	private String name;
	@NotBlank
	private String email;
	private String birthday;
}
