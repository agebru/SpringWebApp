package edu.mum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "Product Ordering Buying and Selling Center! ");
		return "home";
	}

}
