package com.app.service;

import org.springframework.stereotype.Service;

import com.app.util.NameFormatter;

@Service
public class WelcomeService {
	private NameFormatter nameFormatter;
	
	public WelcomeService(NameFormatter nameFormatter) {
		this.nameFormatter = nameFormatter;
	}
	
	public String greet(String name) {
		name = nameFormatter.format(name);
		return "Welcome " + name + " to Spring Boot!";
	}
}
