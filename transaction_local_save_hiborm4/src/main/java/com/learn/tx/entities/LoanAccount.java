package com.learn.tx.entities;

import java.io.Serializable;
import java.util.Objects;

public class LoanAccount implements Serializable{

	protected int loanNo;
	protected String loanAccountHolderName;
	protected String loanType;
	protected String loanAmount;
	
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public String getLoanAccountHolderName() {
		return loanAccountHolderName;
	}
	public void setLoanAccountHolderName(String loanAccountHolderName) {
		this.loanAccountHolderName = loanAccountHolderName;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(loanAccountHolderName, loanAmount, loanNo, loanType);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoanAccount other = (LoanAccount) obj;
		return Objects.equals(loanAccountHolderName, other.loanAccountHolderName)
				&& Objects.equals(loanAmount, other.loanAmount) && loanNo == other.loanNo
				&& Objects.equals(loanType, other.loanType);
	}
	@Override
	public String toString() {
		return "LoanAccount [loanNo=" + loanNo + ", loanAccountHolderName=" + loanAccountHolderName + ", loanType="
				+ loanType + ", loanAmount=" + loanAmount + "]";
	}
	
	
}
