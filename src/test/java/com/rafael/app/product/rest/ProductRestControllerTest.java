package com.rafael.app.product.rest;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.service.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.ArrayList;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductRestController.class)
@AutoConfigureMybatis
class ProductRestControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    @DisplayName("Test Products Controller: Get all products")
    void getAllProductsTest() throws Exception {
        when(productService.getAllProducts()).thenReturn(new ArrayList<Product>());
        this.mockMvc.perform(MockMvcRequestBuilders.get("/products"))
                .andDo(print())
                .andExpect(status().isOk());
    }

}