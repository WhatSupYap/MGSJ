package com.mgsj.hsj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
		
	@GetMapping("/")
	public String hello() {
		return "invisible power (어휴씹덕내)";
	}
}
