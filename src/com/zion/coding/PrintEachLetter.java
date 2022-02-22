package com.zion.coding;

import java.util.Scanner;

public class PrintEachLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = scanner.next();
        System.out.println(word.length());
        for(int i=0;i<=word.length()-1;i++){
            System.out.println(word.charAt(i));

        }



    }
}
