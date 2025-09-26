package com.furnitureStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

 

@Controller
@RequestMapping("/")
public class helloController {
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		model.addAttribute("title", "Hello Page");
		return "hello";
	}

}
