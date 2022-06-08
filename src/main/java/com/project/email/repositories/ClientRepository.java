package com.project.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.email.models.ClientInformationModel;

public interface ClientRepository extends JpaRepository<ClientInformationModel, Long>{

}
