package kr.or.shopprepa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class loginpage {
	@RequestMapping(method = RequestMethod.GET,path = "/loginpage")
	public String loginpage() {
		return "loginpage";
	}

}
