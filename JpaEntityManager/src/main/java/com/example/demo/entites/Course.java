package com.example.demo.entites;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

@NamedQueries(value = {
		@NamedQuery(name="query_get_all_courses",query="select c from Course c"),
		@NamedQuery(name="query_get_where_clause",query="select c from Course c where name like '%spring'")
})
public class Course implements Serializable{

	private static final long serialVersionUID = 8615350811956245814L;

	@Id
	@GeneratedValue
	protected Integer courseId;
	protected String courseName;
	protected String faculity;
	@UpdateTimestamp
	protected LocalDateTime updateTable;
	@CreationTimestamp
	protected LocalDateTime insertTable;
	
	public Course(String courseName, String faculity) {
		super();
		this.courseName = courseName;
		this.faculity = faculity;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", faculity=" + faculity
				+ ", updateTable=" + updateTable + ", insertTable=" + insertTable + "]";
	}
	
	
	
}
