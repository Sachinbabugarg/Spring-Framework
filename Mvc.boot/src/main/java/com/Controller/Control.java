package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Control {

	@RequestMapping("/")
	public String show()
	{
		return "index";
	}
}
