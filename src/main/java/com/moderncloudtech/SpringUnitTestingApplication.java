package com.moderncloudtech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringUnitTestingApplication {
	
	@RequestMapping("/")
	public String Home() {
		
		return " Hello Docker World!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringUnitTestingApplication.class, args);
	}

}
