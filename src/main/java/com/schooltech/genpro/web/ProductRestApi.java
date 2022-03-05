package com.schooltech.genpro.web;

import java.util.List;

import com.schooltech.genpro.entities.Product;

import com.schooltech.genpro.services.ProductService;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value="/api")
public class ProductRestApi {
    
    private ProductService productService;

    public ProductRestApi(ProductService productService){
        this.productService = productService;
    }


    @RequestMapping(value="/products",method = RequestMethod.GET)
    public List<Product> listProducts(){
        return this.productService.getAllProducts();
    }
}
