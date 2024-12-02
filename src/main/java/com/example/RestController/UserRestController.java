package com.example.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.Service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService theuserservice;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return theuserservice.getallusers();
	}

}
