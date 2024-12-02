package com.example.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="subscriptions")
public class Subscription {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sub_id")
	private int id;
	
	
	@ManyToOne
	@JoinColumn(name="user_id",nullable=false)
	private User user;
	
	
	@ManyToOne
	@JoinColumn(name="plan_id",nullable=false)
	private Plan plan;
	
	@Column(name="start_date")
	private LocalDate startDate;
	
	@Column(name="end_date")
	private LocalDate endDate;
	
	@Column(name="status",nullable=false)
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



	public Plan getPlan() {
		return plan;
	}



	public void setPlan(Plan plan) {
		this.plan = plan;
	}



	public LocalDate getStartDate() {
		return startDate;
	}



	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}



	public LocalDate getEndDate() {
		return endDate;
	}



	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Subscription(User user, Plan plan, LocalDate startDate, LocalDate endDate, String status) {
		
		this.user = user;
		this.plan = plan;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	
	public Subscription() {
		
	}




	@Override
	public String toString() {
		return "Subscription [id=" + id + ", user=" + user + ", plan=" + plan + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", status=" + status + "]";
	}
	
	
	
	
}
