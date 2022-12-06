package com.lm;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Employee employee=(Employee)context.getBean("employee");
        System.out.println(employee.getEmpName());
        System.out.println(employee.getAddress().getCity());
        System.out.println(employee.getAddress().getState());
        System.out.println("-------------------------------------------");
//        Employee employee1=(Employee)context.getBean("employee");
//        System.out.println(employee1.getEmpName());
//        System.out.println(employee.getAddress2().getCity());
//        System.out.println(employee.getAddress2().getState());
        context.close();

    }
}
