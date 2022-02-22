package com.zion.practice_test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,44,55,65,3,4,78};
        Arrays.sort(arr);
       // System.out.println(arr[arr.length-2]);
        int n= arr.length;
        System.out.println(arr[n-2]);
    }
}
