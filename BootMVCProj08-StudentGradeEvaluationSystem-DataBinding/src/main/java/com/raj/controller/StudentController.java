package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.model.Student;

@Controller
public class StudentController {

	@GetMapping
	public String showHome() {
		
		System.out.println("StudentController.showHome()");
		return "welcome";
	}
	
	@GetMapping("/register")
	public String registerStudentForm() {
		
		System.out.println("StudentController.registerStudentForm()");
		return "student-form";
	}
	
	@PostMapping("register")
	public String registerStudent(@ModelAttribute("stud") Student stud, Map<String, Object> map) {
		
		map.put("name", stud.getStudentName());
		map.put("marks", stud.getMarks());
		//b.logic
		String grade = null;
		if(stud.getMarks()>=80)
			grade = "A";
		else if(stud.getMarks()>=60)
			grade = "B";
		else if(stud.getMarks()>=40)
			grade = "C";
		else 
			grade = "Fail";
		
		map.put("grade", grade);
		
		//return LVN
		return "student-result";
	}
}
