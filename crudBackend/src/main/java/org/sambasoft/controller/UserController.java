package org.sambasoft.controller;

import java.util.List;

import org.sambasoft.model.User;
import org.sambasoft.repository.UserRepository;
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

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*",allowedHeaders="*")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping("/hi")
	public String hi() {
		return "Hello Deqi Digsa";
	}
	
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable Long id){
		return userRepository.findOne(id);
	}
	
	@DeleteMapping("/user/{id}")
	public boolean deleteUser(@PathVariable Long id){
		 userRepository.delete(id);
		 return true;
	}
	
	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userRepository.save(user);
	}
	@PutMapping("/user")
	public User udateUser(@RequestBody User user){
		return userRepository.save(user);
	}

}
