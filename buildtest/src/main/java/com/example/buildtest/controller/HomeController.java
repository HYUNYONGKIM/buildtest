package com.example.buildtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	private String a = "Hi";
	
	@RequestMapping("/index")
	public String index(Model model) {

		model.addAttribute("a", "di");
		model.addAttribute("b", a);
		System.out.println(a);
		return "index";
	}
}
