package com.shopping_calculator.Shopping_Calculator.service.impl;

import com.shopping_calculator.Shopping_Calculator.dto.CreateProductRequestDto;
import com.shopping_calculator.Shopping_Calculator.model.Product;
import com.shopping_calculator.Shopping_Calculator.service.ProductService;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product create(CreateProductRequestDto requestDto) {
        Product product = new Product();
        product.setId(requestDto.getId());
        product.setName(requestDto.getName());
        product.setPrice(requestDto.getPrice());
        return product;
    }
}
