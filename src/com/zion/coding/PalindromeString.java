package com.zion.coding;

public class PalindromeString {
    static String reverse = "";
    static String str = "level";
    public static void main(String[] args) {
        checkPalindrome(str);
    }
    private static void checkPalindrome(String str) {
        for (int i=str.length()-1;i>=0;i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
