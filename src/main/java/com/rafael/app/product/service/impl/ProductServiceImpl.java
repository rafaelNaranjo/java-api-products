package com.rafael.app.product.service.impl;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;
import com.rafael.app.product.repository.ProductRepository;
import com.rafael.app.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProducts(ProductFilters filters) {
        return productRepository.getAllProducts(filters);
    }
}
