package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.raj.model.Loan;

@Controller
public class LoanController {

	@GetMapping
	public String showHome() {
		System.out.println("LoanController.showHome()");
		
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/register")
	public String loanRegistrationForm() {
		
		System.out.println("LoanController.loanRegistrationForm()");
		
		//return LVN
		return "loan-form";
	}
	
	@PostMapping("/register")
	public String loanRegister(@ModelAttribute("loan") Loan loan, Map<String, Object> map) {
		
		System.out.println("LoanController.loanRegister():: "+loan);
		map.put("loanAmount", loan.getLoanAmount());
		map.put("tenure", loan.getTenureMonths());
		
		Double MonthlyEmi = (loan.getLoanAmount()*loan.getInterestRate())/loan.getTenureMonths();
		
		map.put("emi", MonthlyEmi);
		
		return "loan-result";
	}
}
