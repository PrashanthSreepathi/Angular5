package com.prashanth;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prashanth.entities.User;
import com.prashanth.repository.UserRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable("id") Long id){
		return userRepository.findById(id);
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable("id") Long id){
		userRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/user")
	public boolean createUser( @RequestBody User user){
		userRepository.save(user);
		return true;
	}
	
	@PutMapping("/user")
	public boolean updateUser(@RequestBody User user){
		userRepository.save(user);
		return true;
	}
}
