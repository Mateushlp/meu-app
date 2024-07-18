package com.seudominio.nomeprojeto.services;

import com.seudominio.nomeprojeto.models.Product;
import com.seudominio.nomeprojeto.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
    
    // outros métodos de serviço
}
