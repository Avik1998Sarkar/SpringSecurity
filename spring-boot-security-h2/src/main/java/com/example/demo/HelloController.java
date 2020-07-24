package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String sayHello() {
		return "<h1>Hello ........... </h1>";
	}

	@GetMapping("/user")
	public String sayHelloToUser() {
		return "<h1>Hello User ........... </h1>";
	}

	@GetMapping("/admin")
	public String sayHelloToAdmin() {
		return "<h1>Hello Admin........... </h1>";
	}

	@GetMapping("/avik")
	public String sayHelloToAvik() {
		return "<h1>Hello Avik........... </h1>";
	}
	
}