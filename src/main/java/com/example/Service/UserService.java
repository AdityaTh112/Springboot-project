package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.DAO.UserDAO;
import com.example.Entity.User;

public class UserService{
	
	@Autowired
	private UserDAO theuserDAO;
	
	
	public List<User> getallusers(){
		return theuserDAO.findAll();
	}

}
