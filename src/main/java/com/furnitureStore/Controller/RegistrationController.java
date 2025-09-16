package com.furnitureStore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.furnitureStore.model.User;

import jakarta.validation.Valid;

@Controller
public class RegistrationController {
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String proccessRegistration(@Valid @ModelAttribute("user") User user,BindingResult bindingResult, Model model) {
		
		if(bindingResult.hasErrors()) 
		{
			return "register";	
		}
		
		// add user to data base
		model.addAttribute("successMessage","Registration Succesfull");
		return "register";
	
			
	}
}
