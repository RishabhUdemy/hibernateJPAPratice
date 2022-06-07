package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import com.example.demo.dao.CourseDao;
import com.example.demo.entites.Course;

@SpringBootTest
class JpaEntityManagerApplicationTests {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	CourseDao dao;
	
	@Test
	void contextLoads() {
		logger.info("Test is runnnign runnnnnnnnnn");
		Course course = dao.findCourseById(1);
		assertEquals("Spring Boot Microservices", course.getCourseName());
	}
	
	@Test
	@DirtiesContext
	public void deleteCourse() {
		logger.info("Testing Delete");
		dao.deleteCourse(1);
		assertNull(dao.findCourseById(1));
	}

	@Test
	@DirtiesContext
	public void saveCourse() {
		logger.info("Saving the course");
		Course course = dao.findCourseById(1);
		assertEquals("Sriman Sir", course.getFaculity());
		
		course.setFaculity("Sriman baba");
		
		dao.insertIntoCourse(course);
		
		Course updatedCourse = dao.findCourseById(1);
		assertEquals("Sriman baba",course.getFaculity());
	}
}
