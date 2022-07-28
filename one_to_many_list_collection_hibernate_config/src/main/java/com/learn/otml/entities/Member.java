package com.learn.otml.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Member implements Serializable{

	protected int memberNo;
	protected String memberName;
	protected String role;
	protected int experience;
	protected Date startDate;
	List<Task> assignedTasks;
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public List<Task> getAssignedTasks() {
		return assignedTasks;
	}
	public void setAssignedTasks(List<Task> assignedTasks) {
		this.assignedTasks = assignedTasks;
	}
	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberName=" + memberName + ", role=" + role + ", experience="
				+ experience + ", startDate=" + startDate + ", assignedTasks=" + assignedTasks + "]";
	}
	
	
}
