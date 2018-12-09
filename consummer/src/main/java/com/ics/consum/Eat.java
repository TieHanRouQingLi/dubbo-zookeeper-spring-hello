package com.ics.consum;

import com.ics.service.SayHello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Eat {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("abc.xml");
        SayHello sayHello = (SayHello) ctx.getBean("sayHello");
        String s = sayHello.sayHello("张三");
        System.out.println(s);
    }
}
