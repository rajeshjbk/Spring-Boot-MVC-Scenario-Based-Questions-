package com.raj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.raj.entity.Admin;
import com.raj.repository.AdminRepository;

@Controller
@SessionAttributes("user")
public class LoginController {

	@Autowired
	private AdminRepository adminRepo;

	@GetMapping("/")
	public String home(){
		return "home";
	}

	@GetMapping("/login")
	public String loginPage(){
		return "login";
	}

	@PostMapping("/login")
	public String login(String username,
			String password,
			Model model){

		Admin admin =
				adminRepo.findByUsernameAndPassword(username,password);

		if(admin!=null){
			model.addAttribute("user",username);
			return "dashboard";
		}

		model.addAttribute("msg","Invalid Login");
		return "login";
	}

	@GetMapping("/logout")
	public String logout(SessionStatus status){
		status.setComplete();
		return "home";
	}
	
    @GetMapping("/register")
    public String registerPage(Model model){
        model.addAttribute("admin", new Admin());
        return "register";
    }

    // SAVE ADMIN
    @PostMapping("/register")
    public String saveAdmin(Admin admin, Model model){

        if(adminRepo.existsById(admin.getUsername())){
            model.addAttribute("msg","Username already exists!");
            return "register";
        }

        adminRepo.save(admin);
        model.addAttribute("msg","Registration Successful! Please Login");
        return "login";
    }
}