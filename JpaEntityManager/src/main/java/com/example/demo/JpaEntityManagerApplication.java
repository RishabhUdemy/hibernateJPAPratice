package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.CourseDao;
import com.example.demo.entites.Course;

@SpringBootApplication
public class JpaEntityManagerApplication implements CommandLineRunner{

	@Autowired
	CourseDao dao;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(JpaEntityManagerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Course course = dao.insertIntoCourse(new Course("Spring Boot Microservices", "Sriman Sir"));
		dao.insertIntoCourse(new Course("Spring Boot Microservices", "Natraj Sir"));
		dao.insertIntoCourse(new Course("Spring Boot Microservices", "Narsi Sir"));
		logger.info("Insert into database "+course);
		
		Course findCourse = dao.findCourseById(1);
		logger.info("Course Find id "+findCourse);
		
		//dao.deleteCourse(1);
		
		//play around entity manager
		logger.info("Entity Manager Rule=================");
		dao.entityManagerRule();
		
		// get all query
		dao.getAllCourse().forEach(System.out::println);
		
		//get all query using where clause
		dao.getAllCourseTypeQuery().forEach(System.out::println);
		
		//get the all record using native query
		dao.getAllCourseNativeQuery().forEach(System.out::println);
		
		//get the course record based on where clause 
		dao.getAllCourseNativeQueryWhereClause().forEach(System.out::println);
		
		dao.getAllCourseNativeQueryWhereClauseNameParameter().forEach(System.out::println);
	}
	
}
