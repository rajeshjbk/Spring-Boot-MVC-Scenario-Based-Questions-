package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

    // open login page
    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    // login process
    @PostMapping("/login")
    public String doLogin(@RequestParam String username,
                          @RequestParam String password,
                          HttpSession session,
                          Model model) {

        // Hardcoded validation
        if ("rajesh".equals(username) && "1234".equals(password)) {

            session.setAttribute("user", username);
            return "redirect:/dashboard";
        }

        model.addAttribute("error", "Invalid Credentials");
        return "login";
    }

    // protected page
    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }

    // logout
    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
		
}
