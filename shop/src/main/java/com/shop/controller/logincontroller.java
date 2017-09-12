package com.shop.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class logincontroller {
	@RequestMapping(value="/login")
	public String login()
	{
		return "loginpage";
	}
	
	
}
