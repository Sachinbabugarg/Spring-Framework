package com.SpringTwo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext con=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee s= con.getBean(Employee.class);
		s.setEname("Ahmad");
		s.setId(2);
		System.out.println(s.getEname());
		System.out.println(s.getId());
		System.out.println(s.ename+" "+s.id+" "+s.sal);
	}
}
