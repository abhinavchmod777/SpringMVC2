package com.spring.formController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionFormController 
{
	@RequestMapping(value="/AdmissionForm.html"  )
	public ModelAndView admission()
	{
		ModelAndView obj = new ModelAndView("AdmissionForm");
		return obj;
	}
	
	@RequestMapping(value="/submitForm.html" )
	public ModelAndView submit(@RequestParam("studentName") String name , @RequestParam("studentHobby") String hobby)
	{
		ModelAndView obj = new ModelAndView("Success");
		obj.addObject("msg", "Your name = "+ name + " hobby = " + hobby );
		return obj;
	}
	
}
