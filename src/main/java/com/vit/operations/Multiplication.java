package com.vit.operations;

public class Multiplication {
    int a;
    int b;
    int result;
    public Multiplication( int num1,int num2){
        a=num1;
        b=num2;

    }
    public void Multiply(){
        result=a*b;
        System.out.println("Result of Multiplication is " + result);
    }


}
