package com.zion.acces_modifiers_1;

import com.zion.access_modifiers.AccessModifiersDemo;

/* private members can be accessible in same class only
*  default members can accessible in same class and same package only and we cannot access in other packages
* protected members can be accessible in other packages but that too in sub class and with sub class reference only
* and it should extend other class */
public class ProtectedClass extends  AccessModifiersDemo{
    public static void main(String[] args) {


        //   System.out.println(modifiersDemo.language);//private
       // System.out.println(modifiersDemo.latestVersion);//Default
        ProtectedClass protectedClass = new ProtectedClass();
        System.out.println(protectedClass.relaseDate);//protected
        System.out.println(protectedClass.type);


    }
}
