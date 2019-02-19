package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MessageResource {

    @Value("${message}")
	private String message;

	
	@GetMapping("/message")
	public String hello(){
		System.out.println("Getting Message.....");
		return this.message;
	}
}
