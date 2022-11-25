package com.arshaa.gitsample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class useController {
	 @GetMapping("/helloworld")
	public String demo() {
		return "Hello world updated";
		
	}

}
