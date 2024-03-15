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
		return "Hi Rakuten India welcomes you";
	}	
	
	@GetMapping("rakuten")
	public String getRakuten() {
		return "Rakuten Japan welcomes you.......,.,.....";
	}	
	
	@GetMapping("rakutennew")
	public String getRakuten2() {
		return "New Rakuten India welcomes you.......,.,.....";
	}
}