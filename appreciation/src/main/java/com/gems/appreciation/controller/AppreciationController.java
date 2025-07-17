package com.gems.appreciation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppreciationController {
	
	@GetMapping
	public String welcome() {
		return "welcome to the appreciation web app";
	}

}
