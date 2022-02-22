package com.zion.practice_test;

import java.util.Arrays;

public class ArrayLargest {
    public static void main(String[] args) {
        //int[] arr = new int[5];

        int[] arr = {2,3,12,5,8,7,6};
        int max = arr[0];
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max);

    }
}
