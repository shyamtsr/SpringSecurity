package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value="/login", method=RequestMethod.GET)
	
	public String getLoginPage(ModelMap model) {
		System.out.println("In Login Method page....");
		
		return "login";
	}
	
	@RequestMapping(value="/loginFailed", method=RequestMethod.GET)
	
	public String getLoginFailedPage(ModelMap model) {
		System.out.println("In Login Failed Method page....");
		model.addAttribute("error","true");
		return "login";
	}
	
	@RequestMapping(value="/logout", method=RequestMethod.GET)
	
	public String getLogoutPage(ModelMap model) {
		System.out.println("In Logout Method page....");
		//model.addAttribute("error","true");
		return "logout";
	}
	
@RequestMapping(value="/403", method=RequestMethod.GET)
	
	public String error403(ModelMap model) {
		System.out.println("In Error Method page....");
		//model.addAttribute("error","true");
		return "403";
	}
	
}
