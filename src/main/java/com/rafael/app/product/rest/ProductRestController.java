package com.rafael.app.product.rest;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;
import com.rafael.app.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/products")
public class ProductRestController {
    private final Logger logger = LoggerFactory.getLogger(ProductRestController.class);
    private final ProductService productService;

    @Autowired
    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<Product>> getProducts(ProductFilters filters) {
        logger.debug("Limit to get products {} ", filters);
        List<Product> products = productService.getAllProducts(filters);
        return ResponseEntity.ok(products);
    }
}
