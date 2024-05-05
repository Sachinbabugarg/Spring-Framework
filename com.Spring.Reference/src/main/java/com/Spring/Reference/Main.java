package com.Spring.Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
	Employee e=(Employee) con.getBean("Emp");
	System.out.println(e.getEid());
	System.out.println(e);
}
}
