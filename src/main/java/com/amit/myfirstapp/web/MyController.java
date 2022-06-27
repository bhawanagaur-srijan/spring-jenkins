package com.amit.myfirstapp.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MyController {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return "Hello..... " +name;
	}
	
	@GetMapping("/greeting/{name}")
	public String greeting(@PathVariable String name) {
		return "Very Good Morning.... " +name;
	}
	
}
