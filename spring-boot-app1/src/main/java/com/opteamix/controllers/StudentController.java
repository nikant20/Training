package com.opteamix.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView openHome() {
		System.out.println("Entered inside openHome()");
		ModelAndView mav = new ModelAndView("home","dateKey", new Date());
		return mav;
	}
}
