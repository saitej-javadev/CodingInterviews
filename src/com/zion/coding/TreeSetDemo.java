package com.zion.coding;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> animals = new TreeSet<>();
        animals.add("cat");animals.add("fish");animals.add("elephant");
        animals.add("cat"+"fish");animals.add("ELEPHANT");animals.add("ELEPHANT".toLowerCase());
        System.out.println("Animals: "+animals);
    }
}
