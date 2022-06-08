package com.project.email.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class ClientInformationModel implements Serializable {
	private static final long serialVersionUID=1L;
	
		
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)

	private Long id;
	private String name;
	private String email;
	private String birthday;
	
	
	public ClientInformationModel() {
		
	}

	public ClientInformationModel(String name, String email) {
		
		this.name = name;
		this.email = email;
		
	}
	public ClientInformationModel(String name, String email, String birthday) {
	
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}




	


}
