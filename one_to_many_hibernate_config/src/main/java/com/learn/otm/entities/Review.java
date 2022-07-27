package com.learn.otm.entities;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable{

	protected int reviewNo;
	protected int rating;
	protected String comment;
	protected Date reviewPostedDate;
	protected String reviewBy;
	public int getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getReviewPostedDate() {
		return reviewPostedDate;
	}
	public void setReviewPostedDate(Date reviewPostedDate) {
		this.reviewPostedDate = reviewPostedDate;
	}
	public String getReviewBy() {
		return reviewBy;
	}
	public void setReviewBy(String reviewBy) {
		this.reviewBy = reviewBy;
	}
	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", rating=" + rating + ", comment=" + comment + ", reviewPostedDate="
				+ reviewPostedDate + ", reviewBy=" + reviewBy + "]";
	}
}
