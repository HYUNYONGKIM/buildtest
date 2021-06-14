package com.example.buildtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String index(Model model) {
		String a = "Hi";
		
		model.addAttribute("a", a);
		
		return "index";
	}
}
