package com.apps.newsApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/Home")
	public String home() {
		return "This is Home Page !!!";
	}
	
	@RequestMapping("/About")
	public String about() {
		return "This is About Us Page !!!";
	}
}
