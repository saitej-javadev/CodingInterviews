package com.zion.acces_modifiers_1;

import com.zion.access_modifiers.AccessModifiersDemo;
/*public members can be accessible anywhere in the class and outside of the class and other package too*/

public class PublicClass {
    public static void main(String[] args) {
        //   System.out.println(modifiersDemo.language);//private
        // System.out.println(modifiersDemo.latestVersion);//Default
        AccessModifiersDemo modifiersDemo = new AccessModifiersDemo();
      //  System.out.println(protectedClass.relaseDate);//protected
        System.out.println(modifiersDemo.type);

    }
}
