package com.zion.coding;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Before swapping a:"+a+"   b:"+b);
        temp =a;
        a=b;
        b=temp;
        System.out.println("After swapping a:"+a+"   b:"+b);

    }
}
