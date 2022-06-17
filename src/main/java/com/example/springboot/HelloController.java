package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "MCDS TAP DEMO on 17th June 2022 : Greetings from Spring Boot + Tanzu!";
	}

}
