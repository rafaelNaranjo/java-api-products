package com.rafael.app.product.rest;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;
import com.rafael.app.product.service.ProductService;
import lombok.Value;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.mybatis.spring.boot.test.autoconfigure.AutoConfigureMybatis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.time.Month;
import java.util.ArrayList;

import static org.mockito.ArgumentMatchers.any;
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
        when(productService.getAllProducts(any(ProductFilters.class))).thenReturn(new ArrayList<Product>());
        this.mockMvc.perform(MockMvcRequestBuilders.get("/products"))
                .andDo(print())
                .andExpect(status().isOk());
    }

    /*@Test
    @EnabledOnOs({OS.LINUX, OS.WINDOWS})
    @DisabledOnOs({OS.MAC})
    @EnabledOnJre(JRE.JAVA_11)
    @EnabledIfSystemProperty(named = "java.version", matches = "11")
    @EnabledIfEnvironmentVariable(named = "", matches = "")
    void testJunit5SomeUtilsTags() throws Exception {

    }

    @Nested
    @DisplayName("Product API specifict topics")
    class ProductControllerSpecifictTest {

        @Test
        void testSomeScenary() throws Exception {

        }
        @DisplayName("Product API specifict")
        @RepeatedTest(value = 5, name = "{displayName} - ProductControllerSpecifict {currentRepetition} de {totalRepetitions}")
        void testSomeScenary(RepetitionInfo info) throws Exception {

        }
        @Tag("") indentificacion de test by tag
        @DisplayName("any")
        @ParameterizedTest(name = "{index} {0} - {argumentsWithNames}}")
        @ValueSource
        @CsvFileSource(resources = "", numLinesToSkip = 1)
        @EnumSource(value = Month.class, names = {"month", ""})
        @MethodSource("methodToProduceData")
        void parameterizedTest() throws Exception {

        }
    }*/

}