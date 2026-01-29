package com.raj.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.raj.model.BankAccount;

@Controller
public class BankController {

	@GetMapping("/")
	public String showAccountDetails(Map<String,BankAccount> map) {
		
		map.put("acc1", new BankAccount(9876543210L, "Rajesh Kumar", "Saving", "Hyderabad", 70000.0));
		
		//return LVN
		return "account-summary";
	}
}
