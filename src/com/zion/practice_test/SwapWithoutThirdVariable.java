package com.zion.practice_test;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        doSwap(10,20);
    }

    private static void doSwap(int a, int b) {
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }

}
