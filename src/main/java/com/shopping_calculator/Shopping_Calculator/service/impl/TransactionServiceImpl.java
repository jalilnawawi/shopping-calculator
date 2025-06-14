package com.shopping_calculator.Shopping_Calculator.service.impl;

import com.shopping_calculator.Shopping_Calculator.dto.CreateTransactionRequestDto;
import com.shopping_calculator.Shopping_Calculator.model.Product;
import com.shopping_calculator.Shopping_Calculator.model.Transaction;
import com.shopping_calculator.Shopping_Calculator.service.TransactionService;

import java.util.ArrayList;
import java.util.List;

public class TransactionServiceImpl implements TransactionService {
    @Override
    public void createTransaction() {
        List<Product> productList = new ArrayList<>();
        Product product1 = new Product();
        product1.setId(1);
        product1.setName("Americano");
        product1.setPrice(20000);

        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Espresso");
        product2.setPrice(15000);

        Product product3 = new Product();
        product3.setId(3);
        product3.setName("Latte");
        product3.setPrice(25000);

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);

        System.out.println("=========== Product List =============");
        System.out.println("ID" + "|" + "Nama Produk" + "|" + "Harga");
        productList.forEach(
                product -> System.out.println(product.getId() + "|" + product.getName() + "|" + product.getPrice())
        );

        CreateTransactionRequestDto requestDto = new CreateTransactionRequestDto();
        int transactionId = requestDto.inputTransactionId();
        int productId = requestDto.inputProductId();
        int qty = requestDto.inputQty();
        double subtotal = getProductPriceById(productList, productId) * qty;

        System.out.println("\n==================");
        System.out.println(
                "Product Id = " + productId
        );
        System.out.println(
                "Product Name = " + getProductNameById(productList, productId)
        );
        System.out.println(
                "Quantity = " + qty
        );
        System.out.println(
                "subtotal = " + subtotal
        );
    }

    private Double getProductPriceById(List<Product> productList, int id){
        for (Product product: productList){
            if (product.getId() == id){
                return product.getPrice();
            }
        }
        return null;
    }

    private String getProductNameById(List<Product> productList, int id){
        for (Product product: productList){
            if (product.getId() == id){
                return product.getName();
            }
        }
        return null;
    }
}
