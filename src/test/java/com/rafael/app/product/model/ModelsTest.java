package com.rafael.app.product.model;

import com.rafael.app.utils.TestPojos;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelsTest {

    @Test
    void testModelsProduct() throws Exception {
        TestPojos.validateAccessors(Product.class);
    }
}