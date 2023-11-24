package com.codelounge.test;

import com.codelounge.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Object obj = context.getBean("stud");

        Student st = (Student) obj;
        System.out.println(st.getClass());

        System.out.println(st);


    }
}
