package com.zion.coding;

public class PalindromeNumber {
    static int num= 221;

    public static void main(String[] args) {
        checkPalindrome(num);
    }
     static void checkPalindrome(int num) {
         int r=0,sum=0,temp;
         temp =num;
        while (num>0){
            r= num%10;
            sum = r+sum*10;
            num = num/10;
        }
        if(temp==sum)
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");
    }
}
