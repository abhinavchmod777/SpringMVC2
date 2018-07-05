package com.spring.formController;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.ModelClass.Student;

@Controller
public class AdmissionFormController 
{
	@RequestMapping(value="/AdmissionForm.html" , method=RequestMethod.GET )
	public ModelAndView admission()
	{
		ModelAndView obj = new ModelAndView("AdmissionForm");
		return obj;
	}
	
	@RequestMapping(value="/submitForm.html" )
	public ModelAndView submit(@RequestParam Map<String,String> reqparam)
	{
		String name = reqparam.get("studentName");
		String hobby = reqparam.get("studentHobby");
		Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);
		ModelAndView obj = new ModelAndView("Success");
		obj.addObject("student1",student1 );
		return obj;
	}
	
}
