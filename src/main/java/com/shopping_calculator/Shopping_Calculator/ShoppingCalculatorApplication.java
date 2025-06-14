package com.shopping_calculator.Shopping_Calculator;

import com.shopping_calculator.Shopping_Calculator.controller.TransactionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ShoppingCalculatorApplication {

	public static void main(String[] args) {
		TransactionController transactionController = new TransactionController();
		transactionController.createTransaction();
	}

}
