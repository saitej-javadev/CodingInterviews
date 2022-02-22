package com.zion.java8features;

import java.util.function.Function;
//return type can be anything int,String etc ,and it has apply() method
public class FunctionDemo {
    public static void main(String[] args) {
        Function<String,Integer> f= s->s.length();
        System.out.println(f.apply("saitej"));
    }
}
