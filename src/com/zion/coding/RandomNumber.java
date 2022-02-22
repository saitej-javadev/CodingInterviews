package com.zion.coding;

import java.util.Random;

public class RandomNumber {
public static void getRandomNumber() {
  /*  String otp = "";
    for (int i = 0; i < 4; i++) {
        otp = otp + (int) (Math.random() * 10);//Using Math.random() method
    }
    System.out.println(otp);*/

    Random random = new Random();//using Random class
    System.out.println(random.nextInt(100000));
}
    public static void main(String[] args) {
        RandomNumber.getRandomNumber();


    }
}
