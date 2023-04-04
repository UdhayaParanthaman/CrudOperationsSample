package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long serialNo;
	
	private String brandName;
	
	@Column(name="laptop_price")
	private double price;

	
	public Laptop() {

	}

	public Laptop(Long serialNo, String brandName, double price) {
		super();
		this.serialNo = serialNo;
		this.brandName = brandName;
		this.price = price;
	}

	public Long getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Long serialNo) {
		this.serialNo = serialNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
