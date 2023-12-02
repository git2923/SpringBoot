package com.sourabh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);

//		UserRepo userRepo = context.getBean(UserRepo.class);
//
//		User user = new User();
//		user.setId(2);
//		user.setCity("Bhopal");
//		user.setName("Aditya");
//		user.setAbout("Enginear");
//
//		User obj = userRepo.save(user);
//		System.out.println(obj);

	}

}
