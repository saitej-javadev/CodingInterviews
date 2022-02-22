package com.zion.access_modifiers;
//private members can be accessible within the class only
public class PrivateKeyword {

    public static void main(String[] args) {

       AccessModifiersDemo modifiersDemo = new AccessModifiersDemo();
     //   System.out.println(modifiersDemo.language);//private
        System.out.println(modifiersDemo.latestVersion);
        System.out.println(modifiersDemo.relaseDate);
        System.out.println(modifiersDemo.type);


    }
}
