package com.zion.coding;

import java.util.Scanner;

public class PrintPrime1ToN {
    public static void main(String[] args) {
        int i, count;
        int n=25;
     //   Scanner sc = new Scanner(System.in);
    //    System.out.print("Enter the Range: ");
   //     int n = sc.nextInt();
        for (int j = 2; j <= n; j++) {
            count = 0;
            for (i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + "  ");
        }
    }
}