package com.shopping_calculator.Shopping_Calculator.dto;

import java.util.Scanner;

public class CreateTransactionRequestDto {
    private final Scanner input = new Scanner(System.in);

    public int inputTransactionId(){
        System.out.print("input transactionId = ");
        System.out.flush();
        return input.nextInt();
    }

    public int inputProductId(){
        System.out.print("input productId = ");
        System.out.flush();
        return input.nextInt();
    }

    public int inputQty(){
        System.out.print("input qty = ");
        System.out.flush();
        return input.nextInt();
    }



}
