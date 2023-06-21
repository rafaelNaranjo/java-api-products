package com.rafael.app.product.repository;


import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;

import java.util.List;

public interface ProductRepository {

    List<Product> getAllProducts(ProductFilters filters);

}
