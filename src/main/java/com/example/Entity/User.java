package com.example.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int id;
	
	
	@Column(name="name",nullable=false)
	private String name;
	
	
	@Column(name="email",nullable=false,unique=true)
	private String email;
	
	@Column(name="phone_no",length=10)
	private String phoneNumber;
	
	@Column(name="created_at")
	private LocalDateTime created_at;
	
	@Column(name="updated_at")
	private LocalDateTime updated_at;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public LocalDateTime getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDateTime created_at) {
		this.created_at = created_at;
	}

	public LocalDateTime getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDateTime updated_at) {
		this.updated_at = updated_at;
	}

	public User(String name, String email, String phoneNumber, LocalDateTime created_at, LocalDateTime updated_at) {
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}
	
	public User( ) {
		
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", created_at=" + created_at + ", updated_at=" + updated_at + "]";
	}
	
	
	
	
	

}
