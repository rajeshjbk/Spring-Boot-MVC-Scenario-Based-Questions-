package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.raj.model.Course;
@Controller
public class CourseController {

	@GetMapping("/")
	public String courseDetails(Map<String, Course> map) {
		
		map.put("java", new Course(101, "Java Full Stack","Mr.Raj", 6.0,25000.0));
		map.put("springboot", new Course(102, "Spring Boot","Ms. Asha", 2.0,12000.0));
		
		return "courses";
	}
}
