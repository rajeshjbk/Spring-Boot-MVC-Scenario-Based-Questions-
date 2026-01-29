package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.model.Student;

@Controller
public class StudentController {

	// Show Admission Form
	@GetMapping("/admission-form")
	public String showForm(Model model) {
		model.addAttribute("student", new Student());
		return "admission";
	}

	// Process Form Submission
	@PostMapping("/submit-form")
	public String submitForm(@ModelAttribute("student") Student student) {
		return "confirmation";
	}
}