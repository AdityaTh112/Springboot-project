package com.example.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int id;
	
	@Column(name="username",nullable=false,unique=true)
	private String username;
	
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="role",nullable=false	)
	private String role;

	public int getId() {
		return id;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	public Admin(String username, String email, String password, String role) {
	
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	public Admin() {
		
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password + ", role="
				+ role + "]";
	}
	
	

}
