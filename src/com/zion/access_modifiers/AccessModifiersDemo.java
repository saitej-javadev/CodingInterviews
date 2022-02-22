package com.zion.access_modifiers;

public class AccessModifiersDemo {
    private String language = "Java";
    String latestVersion = "Java SE 16.0.2";
    protected int relaseDate = 1996;
    public String type = "OpenSource";

    public static void main(String[] args) {
        AccessModifiersDemo demo = new AccessModifiersDemo();
        System.out.println(demo.language);
        System.out.println(demo.latestVersion);
        System.out.println(demo.relaseDate);
        System.out.println(demo.type);


    }


}
