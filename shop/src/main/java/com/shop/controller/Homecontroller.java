package com.shop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.dao.CustomerDAO;
import com.shop.entity.Customers;



//import com.gears.dao.Productdao;
//import com.gears.entity.Gears;



@Controller
public class Homecontroller {

	
	
@Autowired
	CustomerDAO dao;
	
	@RequestMapping(value="register", method=RequestMethod.GET)
	public ModelAndView sendregister(@ModelAttribute("customer")Customers customer)
	{
	ModelAndView mv=new ModelAndView("Registerpage");
	return mv;
	}

	@RequestMapping(value="register", method=RequestMethod.POST)
	public ModelAndView getUser(Customers customer)
	{
		
		dao.adduser(customer);
		ModelAndView mv=new ModelAndView("loginpage","user",new Customers());
		return mv;		
	}

	
}
