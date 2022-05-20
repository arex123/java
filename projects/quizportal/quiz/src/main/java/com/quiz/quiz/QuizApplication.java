package com.quiz.quiz;

import com.quiz.quiz.model.Role;
import com.quiz.quiz.model.User;
import com.quiz.quiz.model.UserRole;
import com.quiz.quiz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class QuizApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("project running...");
//
//		User user = new User();
//
//		user.setFirstName("Aditya");
//		user.setLastName("Aditya");
//		user.setUsername("trex2002");
//		user.setEmail("ad47kumar@gmail.com");
//		user.setProfile("default.jpeg");
//
//		Role role1 = new Role();
//		role1.setRoleId(30L);
//		role1.setRoleName("ADMIN");
//
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//
//		userRole.setRole(role1);
//		userRole.setUser(user);
//
//		userRoleSet.add(userRole);
//
//		User user1 = this.userService.createUser(user,userRoleSet);
//		System.out.println(user1.getUsername());


	}
}
