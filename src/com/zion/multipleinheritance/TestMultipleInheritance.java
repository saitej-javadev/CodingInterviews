package com.zion.multipleinheritance;

public class TestMultipleInheritance implements Interface1,Interface2{
    @Override
    public void code() {
        Interface1.super.code();
      /*  Interface2.super.code();
        System.out.println("coding in TestMultipleInheritance");*/
    }

    public static void main(String[] args) {
        TestMultipleInheritance multipleInheritance = new TestMultipleInheritance();
        multipleInheritance.code();
    }
}
