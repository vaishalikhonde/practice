package com.vit.operations;

public class Division {
    int a;
    int b;
    int result;

    public Division( int num1, int num2){
        a=num1;
        b=num2;
    }
    public void Div(){
        result=a/b;
        System.out.println("Result of Division is "+ result);
    }


}
