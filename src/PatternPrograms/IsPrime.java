package PatternPrograms;

import javax.swing.*;

public class IsPrime {
    public static void main(String[] args) {
        checkPrime(17);

    }

    private static void checkPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("prime");
        } else {
            System.out.println("not a prime");
        }
    }
}