package com.zion.coding;

public class PrimeNumberDemo {
    public static void main(String[] args) {
        int num = 67;
        checkPrime(num);
    }

    static void checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
