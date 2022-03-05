package com.schooltech.genpro.services;
import com.schooltech.genpro.entities.Contract;
import java.util.List;


public interface ContractService {
    Contract addContract(Contract contract);
    List<Contract> getAllContracts();
    
}
