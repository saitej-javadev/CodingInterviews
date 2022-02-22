package com.zion.practice_test;

public class CharArrayStringReverse {
    static String name = "Rocky";
    public static void main(String[] args) {
         char[] ch = name.toCharArray();
         for(int i =ch.length-1;i>=0;i--){
             System.out.print(ch[i]);
         }

    }
}
