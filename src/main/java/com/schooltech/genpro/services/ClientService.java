package com.schooltech.genpro.services;

import java.util.List;

import com.schooltech.genpro.entities.Client;

public interface ClientService {
    public List<Client> getAllClients();

    public Client getClient(Long code_client);
}
