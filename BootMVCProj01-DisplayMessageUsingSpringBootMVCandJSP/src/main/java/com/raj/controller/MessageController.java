package com.raj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MessageController {

    @RequestMapping("/message")
    public String showMessage() {
    	
    	//return LVN
        return "message";
    }
}
