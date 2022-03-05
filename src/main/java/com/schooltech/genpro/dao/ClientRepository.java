package com.schooltech.genpro.dao;

import com.schooltech.genpro.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Long> {
    
    
}
