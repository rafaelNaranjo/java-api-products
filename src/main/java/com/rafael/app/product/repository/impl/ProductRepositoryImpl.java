package com.rafael.app.product.repository.impl;

import com.rafael.app.product.mapper.ProductMapper;
import com.rafael.app.product.model.Product;
import com.rafael.app.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductMapper productMapper;

    @Autowired
    public ProductRepositoryImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> getAllProducts() {
        return productMapper.getAllProducts();
    }
}
