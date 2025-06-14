package com.shopping_calculator.Shopping_Calculator.service;

import com.shopping_calculator.Shopping_Calculator.dto.CreateProductRequestDto;
import com.shopping_calculator.Shopping_Calculator.model.Product;

public interface ProductService {
    Product create(CreateProductRequestDto requestDto);
}
