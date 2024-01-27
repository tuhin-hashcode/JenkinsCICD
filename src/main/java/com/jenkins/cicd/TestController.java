package com.jenkins.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String test()
	{
		return "This is a test message just to make sure if Jenkins CICD working fine";
	}
}
