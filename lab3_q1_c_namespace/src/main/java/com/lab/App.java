package com.lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Student s = context.getBean("student", Student.class);
        s.display();
        ((ClassPathXmlApplicationContext) context).close();
    }
}
