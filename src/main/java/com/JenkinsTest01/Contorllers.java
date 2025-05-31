package com.JenkinsTest01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class Contorllers {
	
	@GetMapping
	public String welcome() {
		return "welcome to jenkins";
	}

	@GetMapping("/test")
	public String test() {
		return "welcome to test";
	}
}
