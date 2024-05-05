package com.Spring.reference1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		ApplicationContext ca=new ClassPathXmlApplicationContext("bean.xml");
		Employee e=(Employee) ca.getBean("Emp1");
		System.out.println(e.getCars());
		System.out.println(e.getName());
		System.out.println("This is using getter setter "+e);
		Employee e1=(Employee) ca.getBean("Emp2");
        System.out.println("This is using Constructor "+e1);
	}

}
