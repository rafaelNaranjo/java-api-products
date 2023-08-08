package com.rafael.app.product.service.impl;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;
import com.rafael.app.product.repository.ProductRepository;
import com.rafael.app.utils.FileUtil;
import com.rafael.app.utils.MapperUtil;
import org.junit.jupiter.api.*;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMybatis
class ProductServiceImplTest {

    @MockBean
    private ProductRepository productRepository;

    @Autowired
    private ProductServiceImpl productService;

    private static List<Product> products = Collections.emptyList();
    private ProductFilters productFilters;

    @BeforeAll
    static void setupGlobal() throws Exception {
        String productJson = FileUtil.readFromFileToString("/json/products.json");
        ProductServiceImplTest.products = MapperUtil.deserializeProduct(productJson);
    }

    @BeforeEach
    void setup() throws Exception {
        //MockitoAnnotations.openMocks(this);
        productFilters = new ProductFilters();
    }

    @Test
    @Tag("products")
    @Tag("unitTest")
    @Tag("service")
    @DisplayName("Product Service: Get All product default filters")
    void productServiceGetAllProductsWithDefaultFilter() throws Exception {
        when(productRepository.getAllProducts(any(ProductFilters.class))).thenReturn(
                ProductServiceImplTest.products.stream()
                        .skip(this.productFilters.getOffset())
                        .limit(this.productFilters.getLimit())
                        .collect(Collectors.toList()));
        List<Product> products = productService.getAllProducts(this.productFilters);
        assertNotNull(products);
        assertEquals(this.productFilters.getLimit(), Integer.valueOf(products.size()));
    }

    @Test
    @Tag("products")
    @Tag("unitTest")
    @Tag("service")
    @DisplayName("Product Service: Get All product with offest 10 and limit 10")
    void productServiceGetAllProductsWithChangeFilter() throws Exception {
        this.productFilters.setLimit(10);
        this.productFilters.setOffset(10);
        when(productRepository.getAllProducts(any(ProductFilters.class))).thenReturn(
                ProductServiceImplTest.products.stream()
                        .skip(this.productFilters.getOffset())
                        .limit(this.productFilters.getLimit())
                        .collect(Collectors.toList()));
        List<Product> products = productService.getAllProducts(this.productFilters);
        assertNotNull(products);
        assertEquals(this.productFilters.getLimit(), Integer.valueOf(products.size()));
    }


}