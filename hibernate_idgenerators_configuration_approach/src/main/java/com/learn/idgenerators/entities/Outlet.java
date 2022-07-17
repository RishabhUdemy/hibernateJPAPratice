package com.learn.idgenerators.entities;

import java.io.Serializable;

public class Outlet implements Serializable{

	/* protected int outletNo; */
	protected String outletNo;
	protected String outletName;
	protected String description;
	protected String inChargeName;
	protected int capacity;
	protected String location;
	protected String contactNo;
	public String getOutletNo() {
		return outletNo;
	}
	public void setOutletNo(String outletNo) {
		this.outletNo = outletNo;
	}
	public String getOutletName() {
		return outletName;
	}
	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInChargeName() {
		return inChargeName;
	}
	public void setInChargeName(String inChargeName) {
		this.inChargeName = inChargeName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	@Override
	public String toString() {
		return "Outlet [outletNo=" + outletNo + ", outletName=" + outletName + ", description=" + description
				+ ", inChargeName=" + inChargeName + ", capacity=" + capacity + ", location=" + location
				+ ", contactNo=" + contactNo + "]";
	}
	
	
}
