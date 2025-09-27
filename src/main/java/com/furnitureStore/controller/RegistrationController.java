package com.furnitureStore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.furnitureStore.model.User;

import jakarta.validation.Valid;

/**
 * Controller that handles user registration functionality
 * for the Furniture Store application.
 * 
 * Provides endpoints to:
 * <ul>
 *     <li>Display the registration form</li>
 *     <li>Process submitted registration data</li>
 *     <li>Show registration success page</li>
 * </ul>
 * 
 */
@Controller
public class RegistrationController {
	
	/**
	 * Displays the registration form to the user.
	 *
	 * @param model Spring Model to add attributes to
	 * @return the name of the Thymeleaf template to render ("register")
	 */
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	/**
	 * Processes the submitted registration form.
	 *
	 * Validates the User object, and if errors exist,
	 * returns the registration form template again.
	 * Otherwise, displays the registration success page.
	 *
	 * @param user the User object bound from the form
	 * @param bindingResult the result of validation
	 * @param model Spring Model to add attributes to
	 * @return the name of the template to render
	 */
	@PostMapping("/register")
	public String proccessRegistration(@Valid @ModelAttribute("user") User user,BindingResult bindingResult, Model model) {

		if(bindingResult.hasErrors()) 
		{
			return "register";	
		}
		// add user to database
		model.addAttribute("successMessage","Registration Succesfull");
		return "registration-success";
	
			
	}
}
