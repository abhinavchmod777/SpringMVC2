package com.spring.formController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ModelClass.Student;

@Controller
public class AdmissionFormController 
{
	@ModelAttribute
	public void addCommonObjects(Model mode) {
		mode.addAttribute("headerMsg", "Welcome Spring");
	}
	@RequestMapping(value="/AdmissionForm.html" , method=RequestMethod.GET )
	public ModelAndView admission()
	{
		ModelAndView obj = new ModelAndView("AdmissionForm");
		return obj;
	}
	
	@RequestMapping(value="/submitForm.html" )
	public ModelAndView submit(@ModelAttribute("student1") Student student1 , BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView obj = new ModelAndView("AdmissionForm");
			return obj;
		}
		ModelAndView obj = new ModelAndView("Success");
		return obj;
	}
	
}
