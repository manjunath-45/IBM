package com.example.demo.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Employee;

@Controller
public class HomeController {

	@GetMapping
	public String home(Model theModel) 
	{  
		Employee employee=new Employee();
		theModel.addAttribute("employee",new Employee());
		return "index";
	}
    
	@PostMapping("/processForm")
	public String processForm(@ModelAttribute("employee") Employee theEmployee)
	{
		return "process-form";
		
	}
   
}