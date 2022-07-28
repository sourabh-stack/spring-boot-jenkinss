package com.jenkinss.springboot;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinssApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinssApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Inside INIT method'''''");
	}
	
	public static void main(String[] args) {
		logger.info("Application started...........");
		SpringApplication.run(SpringBootJenkinssApplication.class, args);
	}

}
