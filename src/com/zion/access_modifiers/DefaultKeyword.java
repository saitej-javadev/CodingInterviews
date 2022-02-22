package com.zion.access_modifiers;
//Default members can be accessible within same package
public class DefaultKeyword {
    public static void main(String[] args) {

        AccessModifiersDemo modifiersDemo = new AccessModifiersDemo();
        //   System.out.println(modifiersDemo.language);//private
        System.out.println(modifiersDemo.latestVersion);//Default
        System.out.println(modifiersDemo.relaseDate);
        System.out.println(modifiersDemo.type);


    }
}
