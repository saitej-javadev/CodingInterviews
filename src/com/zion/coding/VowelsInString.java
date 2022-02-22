package com.zion.coding;

import java.util.Scanner;

public class VowelsInString {
    static int vowel=0;
    static int consonant =0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = scanner.nextLine();
        String vowels = "aeiou";
        char ch[] = vowels.toCharArray();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel++;
            } else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                consonant++;
            }
        }
        System.out.println("No. of Vowels: "+vowel);
        System.out.println("No. of Consonants: "+consonant);

    }
}

