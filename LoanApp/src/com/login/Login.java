package com.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getLogin(){
		
		return "Login";
	}
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String getWelcome(){
		
		return "welcome";
	}
}
