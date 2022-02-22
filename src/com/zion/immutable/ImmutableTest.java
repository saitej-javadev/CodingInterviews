package com.zion.immutable;

public class ImmutableTest {
    public static void main(String[] args) {
        StudentImmutableClass immutableClass = new StudentImmutableClass(
                101,"saitej","IT", new Address("NYC","Newyork")
        );
        System.out.println(immutableClass);
        Address address=immutableClass.getAddress();
        address.setCity("WA");
        address.setState("Washington D.C");
        System.out.println(immutableClass);
    }
}
