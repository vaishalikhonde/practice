package com.vit.operations;

public class subtraction {

    int a;
    int b;
    int result;

    public subtraction(int num1, int num2) {
        a = num1;
        b = num2;

    }

    public void sub() {
        result = a - b;
        System.out.println("result of subtraction is:" + result);
    }
}
