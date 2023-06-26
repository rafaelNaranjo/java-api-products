package com.rafael.app.product.rest;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;
import com.rafael.app.product.service.ProductService;
import com.rafael.app.utils.FileUtil;
import com.rafael.app.utils.MapperUtil;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ProductRestController.class)
@AutoConfigureMybatis
class ProductRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    private static List<Product> products = Collections.emptyList();

    @BeforeAll
    static void setupTests() throws Exception {
        String productJson = FileUtil.readFromFileToString("/json/products.json");
        ProductRestControllerTest.products = MapperUtil.deserializeProduct(productJson);
    }

    @Test
    @Tag("products")
    @Tag("unitTest")
    @Tag("api")
    @DisplayName("Product Controller: Get all products")
    void getAllProductsTest() throws Exception {
        when(productService.getAllProducts(any(ProductFilters.class))).thenReturn(ProductRestControllerTest.products);
        this.mockMvc.perform(MockMvcRequestBuilders.get("/products"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*").isArray());
    }

}