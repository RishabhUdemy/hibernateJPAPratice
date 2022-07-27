package com.learn.mto.entities;

import java.io.Serializable;

public class GoldLoan implements Serializable{

	protected int goldloanNo;
	protected String description;
	protected float totalWeight;
	protected float intrestRate;
	protected double loanAmount;
	public int getGoldloanNo() {
		return goldloanNo;
	}
	public void setGoldloanNo(int goldloanNo) {
		this.goldloanNo = goldloanNo;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(float totalWeight) {
		this.totalWeight = totalWeight;
	}
	public float getIntrestRate() {
		return intrestRate;
	}
	public void setIntrestRate(float intrestRate) {
		this.intrestRate = intrestRate;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public String toString() {
		return "GoldLoan [goldloanNo=" + goldloanNo + ", description=" + description + ", totalWeight=" + totalWeight
				+ ", intrestRate=" + intrestRate + ", loanAmount=" + loanAmount + "]";
	}
	
	
}
