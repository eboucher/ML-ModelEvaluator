package com.mastertheboss.springboot.springbootwildfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootwildflyApplication   {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootwildflyApplication.class, args);
	}
}


@RestController
class HelloController {

	@RequestMapping("/hello/{name}")
	String hello(@PathVariable String name) {

		return "Hi "+name+" !";

	}
}