package com.learn.cpkjpa.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="gurage")
public class Gurage implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected GuragePk guragePk;
	@Column(name="proprietor_nm")
	protected String proprietorName;
	@Column(name="contact_no")
	protected String contactNo;
	protected String location;
	
	
	public GuragePk getGuragePk() {
		return guragePk;
	}
	public void setGuragePk(GuragePk guragePk) {
		this.guragePk = guragePk;
	}
	public String getProprietorName() {
		return proprietorName;
	}
	public void setProprietorName(String proprietorName) {
		this.proprietorName = proprietorName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contactNo, guragePk, location, proprietorName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gurage other = (Gurage) obj;
		return Objects.equals(contactNo, other.contactNo) && Objects.equals(guragePk, other.guragePk)
				&& Objects.equals(location, other.location) && Objects.equals(proprietorName, other.proprietorName);
	}
	@Override
	public String toString() {
		return "Gurage [guragePk=" + guragePk + ", proprietorName=" + proprietorName + ", contactNo=" + contactNo
				+ ", location=" + location + "]";
	}
	
	
	
}
