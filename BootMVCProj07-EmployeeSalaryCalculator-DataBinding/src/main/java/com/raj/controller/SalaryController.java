package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.model.Employee;

@Controller
public class SalaryController {

	@GetMapping("/")
	public String showHome() {
		
		return "welcome";
	}
	
	@GetMapping("/register")
	public String showEmployeeRegistrationForm() {
		
		System.out.println("SalaryController.showEmployeeRegistrationForm()");
		
		//return LVN
		return "salary-form";
	}
	
	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute("emp") Employee employee, Map<String, Object> map) {
		
		System.out.println("SalaryController.registerEmployee():: "+employee);
		
		map.put("name", employee.getName());
		//b.logic
		Double grossSalary = employee.getBasicSalary()+employee.getHra();
		Double tax = (grossSalary*employee.getTaxPercentage())/100;
		Double netSalary = grossSalary-tax;
		
		map.put("netSalary", netSalary);
		
		return "salary-result";
		
	}
}
