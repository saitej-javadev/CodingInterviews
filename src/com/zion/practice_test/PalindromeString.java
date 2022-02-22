package com.zion.practice_test;

public class PalindromeString {

    public static void main(String[] args) {
        checkPalindrome("323");
    }

    private static void checkPalindrome(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str = str + s.charAt(i);
        }
        if (str.equals(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
