package com.jenkins;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringJenkins3Application {

	
	
	public static Logger logger = LoggerFactory.getLogger(SpringJenkins3Application.class);
	
	@PostConstruct
	public void init()
	{
		
		logger.info("application started...");
	}
	
	public static void main(String[] args) {
		logger.info("application excecuted");
		SpringApplication.run(SpringJenkins3Application.class, args);
	}

}
