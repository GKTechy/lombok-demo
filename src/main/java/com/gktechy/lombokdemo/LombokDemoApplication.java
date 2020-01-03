package com.gktechy.lombokdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
		
		Users user=new Users();
		
		user.setRoleId(1);
		user.setUserId(1);
		user.setUserName("Test");
		
		System.out.println(user);
		
		
	}

}
