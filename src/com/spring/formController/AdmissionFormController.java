package com.spring.formController;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.EditorClasses.StudentNameEditor;
import com.spring.ModelClass.Student;

@Controller
public class AdmissionFormController 
{
	@ModelAttribute
	public void addCommonObjects(Model mode) {
		mode.addAttribute("headerMsg", "Welcome Spring");
	}
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		binder.registerCustomEditor(Date.class,"studentDOB",new CustomDateEditor(dateFormat,false));
		binder.registerCustomEditor(String.class, "studentName",new StudentNameEditor());
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
