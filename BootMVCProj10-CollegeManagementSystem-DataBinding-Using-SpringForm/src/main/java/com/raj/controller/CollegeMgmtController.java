package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.model.Student;

@Controller
public class CollegeMgmtController {

	@GetMapping("/")
	public String showHome() {

		System.out.println("CollegeMgmtController.showHome()");
		
		return "welcome";
	}

	@GetMapping("/register")
	public String registerStudentPage(@ModelAttribute("st")Student student) {

		System.out.println("CollegeMgmtController.registerStudentPage()");
		return "register-student";
	}

	@PostMapping("/register")
	public String studentRegisteredPage(@ModelAttribute("stud") Student stu, Map<String, Object> map) {

		System.out.println("CollegeMgmtController.studentRegisteredPage()");
		map.put("name", stu.getSname());
		map.put("collegeName", stu.getCollegeName());
		map.put("addrs", stu.getAddrs());
		
		return "result";
	}
}
