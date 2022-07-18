package com.idgenerator.jpa.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill implements Serializable{

	@Id
	@Column(name="bill_no")
	/* @GeneratedValue(strategy = GenerationType.AUTO) */
	/* @GeneratedValue(strategy = GenerationType.IDENTITY) */
	@SequenceGenerator(name="billgen", sequenceName = "bill_no_seq", initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int billNo;
	@Column(name="bill_dt")
	protected Date billDate;
	@Column(name="customer_nm")
	protected String customerName;
	@Column(name="description")
	protected String description;
	@Column(name="amt")
	protected double amount;
	
	public int getBillNo() {
		return billNo;
	}
	public void setBillNo(int billNo) {
		this.billNo = billNo;
	}
	public Date getBillDate() {
		return billDate;
	}
	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Bill [billNo=" + billNo + ", billDate=" + billDate + ", customerName=" + customerName + ", description="
				+ description + ", amount=" + amount + "]";
	}
	
	
	
}
