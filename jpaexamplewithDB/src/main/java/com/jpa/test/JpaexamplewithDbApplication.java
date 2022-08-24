package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;


@SpringBootApplication
public class JpaexamplewithDbApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaexamplewithDbApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
//		
//		User user = new User();
//		user.setName("Nazmul Khan");
//		user.setCity("Rajshahi");
//		user.setStatus("I am Java Developer");
//		
//		User user1 = userRepository.save(user);
//		
//		System.out.println(user1);
		
		
		//Create objecty of User
		User user1 = new User();
		user1.setName("Liton");
		user1.setCity("Dhaka");
		user1.setStatus("Python Programmer");
		
		User user2 = new User();
		user2.setName("Liton");
		user2.setCity("Dhaka");
		user2.setStatus("Python Programmer");
		
		//Saving Single User
		//User resultUser = userRepository.save(user2);
		
		//Saving List in DP
		List<User> users = List.of(user1, user2);
		Iterable<User> resultIterable = userRepository.saveAll(users);
		
		
		resultIterable.forEach(user->{
			System.out.println(user);
		});
	}
	

}
