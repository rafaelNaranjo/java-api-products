package com.rafael.app.product.model;

import com.rafael.app.utils.TestPojos;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 * Test instance por clase se realiza para metodos beforeAll y afeter All dejen de ser estaticos
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ModelsTest {

    @BeforeAll
    void beforeAllTest() throws Exception {

    }

    @AfterAll
    void afterAllTest() throws Exception {

    }

    @AfterEach
    void afterEachTest() throws Exception {

    }
    @BeforeEach
    void beforeEachTest() throws Exception {

    }

    @Test
    void testModelsProduct() throws Exception {
        TestPojos.validateAccessors(Product.class);
        TestPojos.validateAccessors(ProductFilters.class);
    }
}