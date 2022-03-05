package com.schooltech.genpro.services.implementation;
import java.util.List;

import com.schooltech.genpro.dao.ProductRepository;
import com.schooltech.genpro.entities.Product;
import com.schooltech.genpro.services.ProductService;

import org.springframework.stereotype.Service;


@Service
public class IProduct implements ProductService {

    private ProductRepository productRepo;

    public IProduct(ProductRepository productRepository){
        this.productRepo = productRepository;
    }


    @Override
    public List<Product> getAllProducts() {
        return this.productRepo.findAll();
    }


}
