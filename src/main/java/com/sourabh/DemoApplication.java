package com.sourabh;

import com.sourabh.entities.User;
import com.sourabh.repo.UserRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		UserRepo userRepo = context.getBean(UserRepo.class);

		//Create
//		User user = new User();
//		user.setId(3);
//		user.setCity("Indore");
//		user.setName("Spring Boot");
//		user.setAbout("Java Framework");
//		User userSaved = userRepo.save(user);
//		System.out.println("UserSaved => "+userSaved);

		//Read
//		Iterable<User> it = userRepo.findAll();
//		for (User obj : it) {
//			System.out.println(obj);
//		}

		//Update
//		Optional<User> byId = userRepo.findById(1);
//		User obj = byId.get();
//		obj.setAbout("Spring framework which does auto condiguration");
//		System.out.println(userRepo.save(obj));

		//delete
//		userRepo.deleteById(52);
	}

}
