package com.learn.sf.entities;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable{

	protected int addressNo;
	protected String streetName;
	protected int zipCode;
	protected String city;
	protected String state;
	
	public int getAddressNo() {
		return addressNo;
	}
	public void setAddressNo(int addressNo) {
		this.addressNo = addressNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public int hashCode() {
		return Objects.hash(addressNo, city, state, streetName, zipCode);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return addressNo == other.addressNo && Objects.equals(city, other.city) && Objects.equals(state, other.state)
				&& Objects.equals(streetName, other.streetName) && zipCode == other.zipCode;
	}
	@Override
	public String toString() {
		return "Address [addressNo=" + addressNo + ", streetName=" + streetName + ", zipCode=" + zipCode + ", city="
				+ city + ", state=" + state + "]";
	}
	
	
	
}
