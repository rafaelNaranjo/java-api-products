package com.rafael.app.product.service;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts(ProductFilters filters);
}
