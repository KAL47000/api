package com.schooltech.genpro.services.implementation;
import java.util.List;

import com.schooltech.genpro.dao.ContractRepository;
import com.schooltech.genpro.entities.Contract;
import com.schooltech.genpro.services.ContractService;

import org.springframework.stereotype.Service;


@Service
public class IContract implements ContractService {
    
    private ContractRepository contractRepo;

    public IContract(ContractRepository contractRepository){
        this.contractRepo = contractRepository;
    }



    @Override
    public Contract addContract(Contract contract) {
        return contractRepo.save(contract);
    }


    @Override
    public List<Contract> getAllContracts() {
        return this.contractRepo.findAll();
    }


}
