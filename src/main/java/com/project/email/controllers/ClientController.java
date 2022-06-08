package com.project.email.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.email.models.ClientInformationModel;
import com.project.email.services.ClientInformationService;

@RestController
public class ClientController {

	
	@Autowired
	
	ClientInformationService clientInformationService;
	@RequestMapping(value = "/saveCliente")
	public void novoCLiente(@RequestParam(value = "name") String nome, @RequestParam(value = "email") String email){

		ClientInformationModel c = new ClientInformationModel(nome, email);

		clientInformationService.saveClient(c);
		}
}
