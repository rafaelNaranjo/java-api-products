package com.rafael.app.product.mapper;

import com.rafael.app.product.model.Product;
import com.rafael.app.product.model.ProductFilters;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> getAllProducts(@Param("filters") ProductFilters filters);
}
