package com.zion.coding;

import java.util.Scanner;

public class ReverseStringWithStringBuilder {
    public static void main(String[] args) {
        String input="";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the String you want to reverse: ");
            String str = scanner.nextLine();
            StringBuffer buffer = new StringBuffer();
            buffer.append(str);
            StringBuffer reverseString = buffer.reverse();
            System.out.println(reverseString);
            System.out.print("Press YES/NO to continue/stop: ");
             input = scanner.nextLine();
        }
        while(input.equalsIgnoreCase("YES"));

    }
}
