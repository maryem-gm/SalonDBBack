package com.beaute.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beaute.spring.entity.User;
import com.beaute.spring.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/Users")
	public List<User> list() {
		System.out.println("Get all Users");
		return userService.getAll();
	}
	@GetMapping("/Users/{id}")
	public ResponseEntity<User> post(@PathVariable long id) {
		Optional<User> cat = userService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	@GetMapping("/Users/7/{name}")
	public ResponseEntity<User> login(@PathVariable String name){
		Optional<User> cat = userService.login(name);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
		
	}
	@PostMapping("/Users") 
	public long save(@RequestBody User User) {
		return userService.save(User);
	}
	@PutMapping("/Users/{id}")
	public void update(@PathVariable long id, @RequestBody User User) {
		Optional<User> user = userService.findById(id);
		if (user.isPresent()) {
			userService.update(id, User);
			
		}
		else {
			userService.save(User);
		}
	}
@DeleteMapping("/Users/{id}")
public void delete(@PathVariable long id) {
	userService.delete(id);
}
}
