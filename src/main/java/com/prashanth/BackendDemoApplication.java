package com.prashanth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.prashanth.entities.User;
import com.prashanth.repository.UserRepository;

@SpringBootApplication
public class BackendDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	public static void main(String[] args) {
		SpringApplication.run(BackendDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.save(new User("Prashanth","Sreepathi"));
		userRepository.save(new User("Anji","Kale"));
		userRepository.save(new User("Guna","Shekar"));
		
	}
}
