package com.in28minutes.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.in28minutes.login.LoginService;

@Controller		
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	//@ResponseBody
	public String showLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	//@ResponseBody
	public String handelLoginRequest(@RequestParam String name,
			@RequestParam String password, ModelMap modelMap) {
		if (!loginService.validateUser(name, password)) {
			modelMap.put("errorMessage", "Erreur d'autenficiation");
			return "login";
		}
		modelMap.put("name", name);
		modelMap.put("password", password);
		return "welcome";
	}
}
