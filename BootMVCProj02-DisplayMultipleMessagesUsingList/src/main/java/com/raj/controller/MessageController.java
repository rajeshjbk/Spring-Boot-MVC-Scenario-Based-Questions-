package com.raj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

	/*@RequestMapping("/message")
	public Model showMessage() {
	
		System.out.println("MessageController.showMessage()");
		//create Shared Memory
		Model model = new BindingAwareModelMap();
	
		//add model attributes
		model.addAttribute("l1","Welcome! ");
		model.addAttribute("l2","Spring Boot is fun! ");
		model.addAttribute("l3","Keep Learning! ");
	
		return model;
	}*/
	
	@RequestMapping("/message")
    public String showMessage(Model model) {

        List<String> list = new ArrayList<>();
        list.add("Welcome !");
        list.add("Spring Boot is fun!");
        list.add("Keep Learning!");

        model.addAttribute("list", list);

        return "message";   // message.jsp
    }
}
