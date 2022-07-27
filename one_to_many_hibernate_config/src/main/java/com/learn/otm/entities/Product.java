package com.learn.otm.entities;

import java.io.Serializable;
import java.util.Set;

public class Product implements Serializable{

	protected int productNo;
	protected String productName;
	protected String description;
	protected String manufacture;
	protected double amount;
	protected Set<Review> productReviews;
	
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Set<Review> getProductReviews() {
		return productReviews;
	}
	public void setProductReviews(Set<Review> productReviews) {
		this.productReviews = productReviews;
	}
	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", description=" + description
				+ ", manufacture=" + manufacture + ", amount=" + amount + ", productReviews=" + productReviews + "]";
	}
}
