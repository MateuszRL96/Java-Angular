package com.example.demo.services;


import com.example.demo.entity.Product;
import com.example.demo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts()
    {
        return productRepo.findAll();
    }

    public Optional<Product> getProductById(Long id)
    {
        return productRepo.findById(id);
    }

    public Product saveProduct(Product product)
    {
        return productRepo.save(product);
    }

    public void deleteProduct(Long id)
    {
        productRepo.deleteById(id);
    }
}
