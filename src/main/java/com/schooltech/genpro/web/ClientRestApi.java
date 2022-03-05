package com.schooltech.genpro.web;

import java.util.List;

import com.schooltech.genpro.entities.Client;
import com.schooltech.genpro.services.ClientService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ClientRestApi {

    private ClientService clientService;

    public ClientRestApi(ClientService clientService){
        this.clientService = clientService;
    }

    @RequestMapping(value="/clients",method = RequestMethod.GET)
    public List<Client> listClients(){
        return this.clientService.getAllClients();
    }
    
}
