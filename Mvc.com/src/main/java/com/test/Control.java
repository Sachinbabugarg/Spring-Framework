package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {
 
	@RequestMapping("/")
 public String show()
 {
	 	
	 return "index";
 }
	@RequestMapping("hello")
	public String Message()
	{
		return "hello";
	}
	@RequestMapping("sachin")
	public String Sachin()
	{
		return "sachin";
	}
}

