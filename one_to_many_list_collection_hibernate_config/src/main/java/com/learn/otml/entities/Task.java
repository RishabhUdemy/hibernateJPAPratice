package com.learn.otml.entities;

import java.io.Serializable;

public class Task implements Serializable{

	protected int taskNo;
	protected String title;
	protected String description;
	protected int duration;
	protected String status;
	
	public int getTaskNo() {
		return taskNo;
	}
	public void setTaskNo(int taskNo) {
		this.taskNo = taskNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Task [taskNo=" + taskNo + ", title=" + title + ", description=" + description + ", duration=" + duration
				+ ", status=" + status + "]";
	}
	
	
}
