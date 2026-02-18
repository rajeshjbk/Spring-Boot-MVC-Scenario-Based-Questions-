package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.raj.model.Login;

@Controller
public class LoginController {

	@GetMapping("/")
	public String homePage() {
		
		return "welcome";
	}
	
	@GetMapping("/login")
	public String loginFormPage(@ModelAttribute("signup") Login login) {
		
		return "loginForm";
	}
}
