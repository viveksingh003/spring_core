package com.codelounge.test;

import com.codelounge.beans.WishMessageGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!- main method()");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        //System.out.println(context);
//create IOC Container/BeanFactory spring bean container

        //XmlBeanFactory factory = new XmlBeanFactory(res);

//get Target(Spring Bean) class obj from IOC container

        Object obj = context.getBean("wmg");
        System.out.println(obj.hashCode());//1405747618
        Object obj2 = context.getBean("wmg");
        System.out.println(obj2.hashCode());//1405747618


//typecasting

        WishMessageGenerator gen = (WishMessageGenerator) obj;
//invoke the business method

        String result = gen.generateWM("ABC");
        System.out.println(result);
    }
}
