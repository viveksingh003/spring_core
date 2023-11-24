package com.codelounge.test;

import java.lang.reflect.Constructor;

public class Reflection_Instantiation {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("com.codelounge.beans.TestReflection");
        Object obj = c.newInstance();
        System.out.println(obj.toString());

        Constructor constructor[] = c.getDeclaredConstructors();
        Object obj2 = constructor[0].newInstance();
        System.out.println(obj2.toString());
        Object obj3 = constructor[1].newInstance(10, 20);
        System.out.println(obj3.toString());
        //constructor in array by order.


    }
}
