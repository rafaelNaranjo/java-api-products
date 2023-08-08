package com.rafael.app.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.rafael.app.product.model.Product;

import java.util.Arrays;
import java.util.List;

public class MapperUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static List<Product> deserializeProduct(String json) throws Exception {
        return Arrays.asList(objectMapper.readValue(json, Product[].class));
    }
}
