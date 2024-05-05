package com.SpringTwo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

@Bean
public Employee Emp()
{   
	return new Employee(1,"alok",202.2);
}


}
