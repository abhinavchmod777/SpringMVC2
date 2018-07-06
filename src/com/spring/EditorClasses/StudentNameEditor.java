package com.spring.EditorClasses;

import java.beans.PropertyEditorSupport;

public class StudentNameEditor extends PropertyEditorSupport
{
	public void setAsText(String stud)throws IllegalArgumentException
	{
		if(stud.contains("Mr. ") || stud.contains("Ms. ")) {
			setValue(stud);
		}
		
		else {
			stud = "Mr. "+stud;
			setValue(stud);
		}
	}
}
