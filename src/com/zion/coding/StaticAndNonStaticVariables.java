package com.zion.coding;
//can access static and non-static variables from instance method.
//can access only static variables from static methods but not non-static variables.
public class StaticAndNonStaticVariables {
    static int a=10;
    int b =20;

    static void show(){
        System.out.println(a);
      // System.out.println(b);//Non-static field 'b' cannot be referenced from a static context
    }
    void show1(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        show();
        new StaticAndNonStaticVariables().show1();
    }
}
