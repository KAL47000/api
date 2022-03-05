package com.schooltech.genpro.web;

import java.util.List;

import com.schooltech.genpro.entities.Contract;
import com.schooltech.genpro.services.ContractService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class ContratRestApi {

    private ContractService contractService;

    public ContratRestApi(ContractService contractService){
        this.contractService = contractService;
    }

    @RequestMapping(value="/contracts",method = RequestMethod.GET)
    public List<Contract> listContracts(){
        return this.contractService.getAllContracts();
    }

    @RequestMapping(path="/contracts", method=RequestMethod.POST)
    public Contract addContract(@RequestBody Contract contract){
        return this.contractService.addContract(contract);
    }

}
