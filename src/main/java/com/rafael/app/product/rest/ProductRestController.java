package com.rafael.app.product.rest;

import com.rafael.app.product.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductRestController {

    @GetMapping()
    public ResponseEntity<List<Product>> getProducts() {
        return ResponseEntity.ok(new ArrayList<>());
    }
}
