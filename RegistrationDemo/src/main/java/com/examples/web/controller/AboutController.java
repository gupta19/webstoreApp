package com.examples.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController {
	
	@RequestMapping(value="/aboutit", method=RequestMethod.GET)
	public String dispalyAbout(){
		return "about";
	}

}
