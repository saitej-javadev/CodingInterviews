package com.zion.practice_test;

public class FibanacciSeries {
    public static void main(String[] args) {
        findFibanacci(15);



    }

    private static void findFibanacci(int count) {
        int n1=0,n2=1,n3;
        System.out.print(n1+" "+n2+" ");
        for (int i=0;i<count;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+" ");
        }
    }
}
