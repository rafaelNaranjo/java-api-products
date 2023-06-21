package com.rafael.app.product.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ProductFilters {

    private Integer limit = 20;
    private Integer offset = 0;

}
