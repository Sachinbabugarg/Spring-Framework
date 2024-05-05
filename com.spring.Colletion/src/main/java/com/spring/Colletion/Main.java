package com.spring.Colletion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
public static void main(String[] args) {
	ApplicationContext ca=new ClassPathXmlApplicationContext("beans.xml");
	Employee e=(Employee) ca.getBean("Collection");
	System.out.println("String Name = "+e.getName());
	System.out.println("String String Map = "+e.getId());
	System.out.println("String List = "+e.getAddress());
	System.out.println("Set Phones = "+e.getPhones());
	System.out.println("Properties = "+e.getProps());
    //System.out.println(e);
}
}
