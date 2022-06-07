package com.learn.entities;

import java.io.Serializable;
import java.util.Objects;

public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	
	protected int accountNo;
	protected String accountHolderName;
	protected String accountType;
	protected String mobileNo;
	protected String emailAddress;
	protected String balance;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName, accountNo, accountType, balance, emailAddress, mobileNo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountHolderName, other.accountHolderName) && accountNo == other.accountNo
				&& Objects.equals(accountType, other.accountType) && Objects.equals(balance, other.balance)
				&& Objects.equals(emailAddress, other.emailAddress) && Objects.equals(mobileNo, other.mobileNo);
	}
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", mobileNo=" + mobileNo + ", emailAddress=" + emailAddress + ", balance=" + balance
				+ "]";
	}
}
