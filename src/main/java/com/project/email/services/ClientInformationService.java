package com.project.email.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.email.models.ClientInformationModel;
import com.project.email.repositories.ClientRepository;



@Service
public class ClientInformationService {

		@Autowired
		ClientRepository clientRepository;

		public ClientInformationModel saveClient(ClientInformationModel clientInformationModel){
			return clientRepository.save(clientInformationModel);
		}
}
