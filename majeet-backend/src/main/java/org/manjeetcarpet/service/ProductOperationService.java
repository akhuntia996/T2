package org.manjeetcarpet.service;

import java.util.List;

import org.manjeetcarpet.modelVO.product.Product;
import org.manjeetcarpet.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductOperationService {

    private static final Logger logger = LoggerFactory.getLogger(ProductOperationService.class);

    @Autowired
    private ProductRepository productRepository;
    
    // ************************************************************
    // Method for Fetching Product (Accessed All Users and Admin)
    // ************************************************************
    public List<Product> getAllProducts(){
        logger.info("Getting all Products Available");
        return productRepository.findAll();
    }

    // public void getfilteredProducts(String attribute, String target){ 
    // }   

    // ******************************************************************
    // Methods for Add, Remove and Update Product (Accessed by Admin)
    // ******************************************************************
    // public void addProduct(){
    // }

    // public void removeProduct(){
    // }

    // public void updateProduct(){
    // }
}
