package com.zion.privateconstructor;

import java.lang.reflect.Constructor;

public class PrivateConTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        try{
            Class c = Class.forName("com.zion.privateconstructor.PrivateConstructor");
            Constructor con = c.getDeclaredConstructor();
            con.setAccessible(true);
            con.newInstance();
        }catch(Exception e){}

    }


}
