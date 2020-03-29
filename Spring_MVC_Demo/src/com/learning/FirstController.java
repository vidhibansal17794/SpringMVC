package com.learning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {


	@RequestMapping("/")
	public String ControllerMethod()
	{
		return "FirstView";
		
	}
	
}
