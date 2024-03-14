package com.training.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RakutenDevopsJenkinsApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(RakutenDevopsJenkinsApplication.class, args);
	}
	
	@GetMapping
	public String getMessage() {
		return "Rakuten India welcomes you.......,.,.....";
	}	
	
	@GetMapping("rakuten")
	public String getRakuten() {
		return "Rakuten India welcomes you.......,.,.....";
	}	
}