package com.learn.cpkjpa.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class GuragePk implements Serializable{

	@Column(name="gurage_club_regno")
	protected String gurageClubRegNo;
	@Column(name="gurage_nm")
	protected String gurageName;
	
	public String getGurageClubRegNo() {
		return gurageClubRegNo;
	}
	public void setGurageClubRegNo(String gurageClubRegNo) {
		this.gurageClubRegNo = gurageClubRegNo;
	}
	public String getGurageName() {
		return gurageName;
	}
	public void setGurageName(String gurageName) {
		this.gurageName = gurageName;
	}
	@Override
	public int hashCode() {
		return Objects.hash(gurageClubRegNo, gurageName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GuragePk other = (GuragePk) obj;
		return Objects.equals(gurageClubRegNo, other.gurageClubRegNo) && Objects.equals(gurageName, other.gurageName);
	}
	@Override
	public String toString() {
		return "GuragePk [gurageClubRegNo=" + gurageClubRegNo + ", gurageName=" + gurageName + "]";
	}
	
	
}
