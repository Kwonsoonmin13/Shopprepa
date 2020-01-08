package kr.or.shopprepa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainpage {
	@RequestMapping(path = "/mainpage")
	public String mainpage() {
		return "mainpage";
	}

}
