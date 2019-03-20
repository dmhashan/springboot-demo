package com.rst.boot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class first {

	@GetMapping("/")
	public String hello() {
		return "Hello World";
	}
}
