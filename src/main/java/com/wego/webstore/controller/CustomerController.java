package com.wego.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wego.webstore.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
//	@RequestMapping("/customers")
//	public String list(Model model) {
//		model.addAttribute("customers", customerService.getAllCustomers());
//		return "customers";
//	}
	
	@RequestMapping("/list")
	public String list(Model model) {
	return "customers";
	} @
	RequestMapping("/process")
	public String process(Model model) {
	// return
		return "redirect:/customers/list";
	}
}


