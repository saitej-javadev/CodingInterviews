package com.zion.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
       List al = Arrays.asList("sai",23,null,'a',23);
//        System.out.println(al);
        Object[] obj=al.toArray();
        for(Object obj1:obj){
            System.out.println(obj1);
        }
    }
}
