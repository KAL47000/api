package com.schooltech.genpro.web;

import java.util.List;

import com.schooltech.genpro.entities.Client;
import com.schooltech.genpro.services.ClientService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
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

    @RequestMapping(value="/clients/{code_client}",method = RequestMethod.GET)
    public Client getClientById(@PathVariable Long code_client){
        return this.clientService.getClient(code_client);
    }
}
