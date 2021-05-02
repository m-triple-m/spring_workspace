package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Main {
	
//	@GetMapping("/register")
//	@ResponseBody()
//	public String Register() {
//		return "Register page from Spring boot";
//	}
	
	@GetMapping("/register")
	public ModelAndView getRegisterPage() {
		ModelAndView mv = new ModelAndView("register.html");
		return mv;
	}
	
	
	@PostMapping("/register")
	public void processRegister() {
		
	}
	
	
	
}
