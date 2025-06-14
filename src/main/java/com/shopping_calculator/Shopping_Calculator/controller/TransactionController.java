package com.shopping_calculator.Shopping_Calculator.controller;

import com.shopping_calculator.Shopping_Calculator.service.TransactionService;
import com.shopping_calculator.Shopping_Calculator.service.impl.TransactionServiceImpl;

public class TransactionController {
    TransactionService transactionService = new TransactionServiceImpl();

    public void createTransaction(){
        transactionService.createTransaction();
    }
}
