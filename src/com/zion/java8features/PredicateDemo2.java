package com.zion.java8features;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        int n=14;
        Predicate<Integer> pd = p->p%2==0;
        if(pd.test(n)==true){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
