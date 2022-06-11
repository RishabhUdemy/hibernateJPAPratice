package com.learn.sc.entities;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

public class Employee implements Serializable{

	protected int employeeId;
	protected String Dept;
	protected Date dobDate;
	protected Date dateOfJoining;
	protected Time joiningTime;
	protected String name;
	protected double salary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public Date getDobDate() {
		return dobDate;
	}
	public void setDobDate(Date dobDate) {
		this.dobDate = dobDate;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public Time getJoiningTime() {
		return joiningTime;
	}
	public void setJoiningTime(Time joiningTime) {
		this.joiningTime = joiningTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Dept, dateOfJoining, dobDate, employeeId, joiningTime, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Dept, other.Dept) && Objects.equals(dateOfJoining, other.dateOfJoining)
				&& Objects.equals(dobDate, other.dobDate) && employeeId == other.employeeId
				&& Objects.equals(joiningTime, other.joiningTime) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", Dept=" + Dept + ", dobDate=" + dobDate + ", dateOfJoining="
				+ dateOfJoining + ", joiningTime=" + joiningTime + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
