package com.SpringThree;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
public static void main(String[] args) {
	
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	Company con=(Company) c.getBean("Com");
	con.setCname("Capgemini");
	con.setId(1);
	con.setName("Sachin");
	System.out.println("cpmpany name = "+con.getCname());
	System.out.println("Company id = "+con.getId());
	System.out.println("Name = "+con.getName());
	
	Company con1=(Company) c.getBean("Com");
	con1.setCname("Hp");
	con1.setId(2);
	con1.setName("Manish");   
	System.out.println("cpmpany name = "+con1.getCname());
	System.out.println("Company id = "+con1.getId());
	System.out.println("Name = "+con1.getName());
	
	Company con2= (Company) c.getBean("Com");
	con2.setCname("DELL");
	con2.setId(3);
	con2.setName("ROhit"); 
	System.out.println(con2);
	//System.out.println(con1.getCname());
	//System.out.println(con1.getId());
	//System.out.println(con1.getName());
	 
	System.out.println("This is for prototype jo many object create karta h aur agrr 2nd mai khuch nhi dete toh null dega");
	Company con4= (Company) c.getBean("Com2");
	con4.setCname("Single");
	con4.setId(4);
	con4.setName("okk");
	System.out.println(con4);
	
	Company con5= (Company) c.getBean("Com2");
	System.out.println(con5);
	System.out.println("This is for one obj jo ek bar banega agr 2nd mai khuch nhi dete toh ohh vahi obj repeat karega");
	Company con6= (Company) c.getBean("Com3");
	con6.setCname("Double");
	con6.setId(5);
	con6.setName("okk Google");
	System.out.println(con6);
	
	Company con7= (Company) c.getBean("Com3");
	System.out.println(con7);
	
	
}
}
