package com.example.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Entity.User;

@Repository
public interface UserDAO extends JpaRepository <User,Integer>{
	
	public List<User> findAll();

}
