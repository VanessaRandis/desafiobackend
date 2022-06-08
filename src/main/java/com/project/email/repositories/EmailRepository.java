package com.project.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.email.models.EmailNewsModel;

public interface EmailRepository extends JpaRepository<EmailNewsModel, Long>{

}
