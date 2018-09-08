package com.sgic.myleave.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.myleave.entity.User;

@RestController
public class UserController {
	List<User> users = new ArrayList<>();
	
	@GetMapping("/users")
	public List<User> users() {
		return users;
	}
	
	
	@PostMapping(value = "/xyz")
	public List<User> createUser(@RequestBody User user) {
		users.add(user);
		return users;
	}
}
