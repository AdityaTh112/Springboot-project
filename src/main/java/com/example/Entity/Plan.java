package com.example.Entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="plan")
public class Plan {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="plan_id")
	private int id;
	
	
	@Column(name="plan_name",nullable=false,unique=true)
	private String name;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="price",nullable=false)
	private BigDecimal price;
	
	
	@Column(name="billing_cycle",nullable=false)
	private String billingCycle;
	
	@Column(name="plan_created_at")
	private LocalDateTime createdAt;
	
	
	@Column(name="plan_updated_at")
	private LocalDateTime updatedAt;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public BigDecimal getPrice() {
		return price;
	}


	public void setPrice(BigDecimal price) {
		this.price = price;
	}


	public String getBillingCycle() {
		return billingCycle;
	}


	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}


	public int getId() {
		return id;
	}


	public Plan() {
		
	}


	public Plan(String name, String description, BigDecimal price, String billingCycle, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.billingCycle = billingCycle;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}


	@Override
	public String toString() {
		return "Plan [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", billingCycle=" + billingCycle + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
	
	
	
	
	
	
	

}
