package com.SpringOne;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
public static void main(String[] args) {
	/*BeanFactory f=new XmlBeanFactory(new ClassPathResource("beans.xml"));
	Student s=(Student) f.getBean("student");
	System.out.println(s.getName());
	System.out.println(s.getId());*/
	
	/*BeanFactory f=new XmlBeanFactory(new ClassPathResource("beans.xml"));
	Student s=(Student) f.getBean("student1");
	System.out.println(s.name);
	System.out.println(s.id);*/
	
	/*ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	Student s=(Student) c.getBean("student");
	System.out.println(s.getName());
	System.out.println(s.getId());*/
	
	ApplicationContext ca=new ClassPathXmlApplicationContext("beans.xml");
	Student sa=(Student) ca.getBean("student1");
	System.out.println(sa.name);
	System.out.println(sa.id);
	
	Student sa1=(Student) ca.getBean("student2");
	System.out.println(sa1.name);
	System.out.println(sa1.id);
	System.out.println("This is using p schema");
	Student sa2=(Student) ca.getBean("student3");
	System.out.println(sa2.name);
	System.out.println(sa2.id);
	
	
	}
}
