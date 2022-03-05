package com.schooltech.genpro.services.implementation;

import java.util.List;

import com.schooltech.genpro.dao.ClientRepository;
import com.schooltech.genpro.entities.Client;
import com.schooltech.genpro.services.ClientService;

import org.springframework.stereotype.Service;


@Service
public class IClient implements ClientService {
    
    private ClientRepository clientRepo;

    public IClient(ClientRepository clientRepository){
        this.clientRepo = clientRepository;
    }
    @Override
    public List<Client> getAllClients() {
        return this.clientRepo.findAll();
    }

    @Override
    public Client getClient(Long code_client) {
        return clientRepo.findById(code_client).orElse(null);
    }
}
