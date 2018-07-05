package com.spring.helloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	@RequestMapping("/welcome/{username}")
	public ModelAndView helloWorld(@PathVariable("username")String name)
	{
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage","HI "+name);
		
		return modelAndView;
	}
	@RequestMapping("/hi")
	public ModelAndView hiWorld()
	{
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage","this is multiaction controller class");
		
		return modelAndView;
	}

}
