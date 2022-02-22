package com.zion.coding;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1.Largest element in an array\r\n" +
                "2.Second Largest element in an array\r\n" +
                "3.Smallest element in an array\r\n");
        int option = sc.nextInt();
        System.out.print("Enter the number you want to initialize the array: ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");}
        switch (option) {
            case 1:
            int max = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("The largest element in the array: "+max);
            break;
            case 2:
                Arrays.sort(arr);
                System.out.println("\nSecond largest element in an array: "+arr[arr.length-2]);
                break;
        default:
        System.out.println("Invalid operator!");
        break;
        }
    }
}
