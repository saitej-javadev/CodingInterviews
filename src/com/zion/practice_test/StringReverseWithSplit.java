package com.zion.practice_test;

public class StringReverseWithSplit {
    static String name = "Spring";
    public static void main(String[] args) {
       String[] str = name.split("");
       for (int i =str.length-1;i>=0;i--){
           System.out.print(str[i]);
       }
    }
}
