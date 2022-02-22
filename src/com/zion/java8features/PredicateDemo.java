package com.zion.java8features;


import java.util.Scanner;
import java.util.function.Predicate;

//Return type is boolean and it has test() method
public class PredicateDemo {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char c = scanner.next().charAt(0);
      Predicate<Character> p = ch->ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
        System.out.println(p.test(c));

        }
    }

