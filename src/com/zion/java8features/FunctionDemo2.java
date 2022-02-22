package com.zion.java8features;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<Integer,Integer> f = s->s*s;
        System.out.println(f.apply(5));
    }
}
