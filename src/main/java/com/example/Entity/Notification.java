package com.example.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="notifications")
public class Notification {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="notification_id")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	
	
	@Column(name="message",nullable=false)
	private String message;
	
	
	@Column(name="type",nullable=false)
	private String type;
	
	@Column(name="sent_at",nullable=false)
	private LocalDateTime sentAt;
	
	@Column(name="message_status",nullable=false)
	private String status;

	public int getId() {
		return id;
	}

	

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getSentAt() {
		return sentAt;
	}

	public void setSentAt(LocalDateTime sentAt) {
		this.sentAt = sentAt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}



	public Notification(User user, String message, String type, LocalDateTime sentAt, String status) {
		
		this.user = user;
		this.message = message;
		this.type = type;
		this.sentAt = sentAt;
		this.status = status;
	}
	
	public Notification(){
		}



	@Override
	public String toString() {
		return "Notification [id=" + id + ", user=" + user + ", message=" + message + ", type=" + type + ", sentAt="
				+ sentAt + ", status=" + status + "]";
	}
	
	
	
}