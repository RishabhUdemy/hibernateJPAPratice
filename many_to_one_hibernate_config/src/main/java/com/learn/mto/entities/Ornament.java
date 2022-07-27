package com.learn.mto.entities;

import java.io.Serializable;

public class Ornament implements Serializable{

	protected int ornamentNo;
	protected String description;
	protected float weight;
	protected double estimatedValue;
	protected GoldLoan goldLoan;
	
	
	public GoldLoan getGoldLoan() {
		return goldLoan;
	}
	public void setGoldLoan(GoldLoan goldLoan) {
		this.goldLoan = goldLoan;
	}
	public int getOrnamentNo() {
		return ornamentNo;
	}
	public void setOrnamentNo(int ornamentNo) {
		this.ornamentNo = ornamentNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public double getEstimatedValue() {
		return estimatedValue;
	}
	public void setEstimatedValue(double estimatedValue) {
		this.estimatedValue = estimatedValue;
	}
	@Override
	public String toString() {
		return "Ornament [ornamentNo=" + ornamentNo + ", description=" + description + ", weight=" + weight
				+ ", estimatedValue=" + estimatedValue + ", goldLoan=" + goldLoan + "]";
	}
	
}
