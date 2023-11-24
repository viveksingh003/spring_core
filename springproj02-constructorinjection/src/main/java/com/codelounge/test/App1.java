package com.codelounge.test;

import com.codelounge.beans.WishGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.Month;

public class App1 {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        Object obj=context.getBean("wmg");

        WishGenerator generator=(WishGenerator)obj;


        generator.m1();



    }
}
