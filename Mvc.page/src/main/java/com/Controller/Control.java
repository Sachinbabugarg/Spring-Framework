package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Control.Emp;

@Controller
public class Control {

	@RequestMapping("/")
	public String show()
	{
		return "index";
	}
	@RequestMapping("/EmployeeForm")
	public String employeeForm(Model model)
	{
		Emp o=new Emp();
		model.addAttribute("employee" , o);
		return "FirstPage";
		
	}
	@RequestMapping("/submitForm")
	public String submit(@ModelAttribute("employee") Emp o)
	{
		return "Secondpage";
	}
	
}
