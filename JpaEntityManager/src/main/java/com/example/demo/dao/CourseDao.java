package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.Course;

@Repository
@Transactional
public class CourseDao {


	@Autowired
	EntityManager em;

	// Insert course into the database need to use Transactional
	public Course insertIntoCourse(Course course) {
		if (course.getCourseId() == null)
			// Inerstion into the table
			em.persist(course);
		else
			// Update into the table
			em.merge(course);
		return course;
	}

	// Find course by id using em.find
	public Course findCourseById(int id) {
		return em.find(Course.class, id);
	}

	// Delete the course using by id
	public void deleteCourse(int id) {
		Course course = findCourseById(id);
		if (course != null)
			em.remove(course);
	}

	// Entity Manager
	public void entityManagerRule() {
		Course course1 = new Course("Hibernate", "Sriman Sir");
		em.persist(course1);
		em.flush();
		em.detach(course1);

		// if we update in the course the update query will perform and insert natraj sir the value
		//if we use detach method then it will not change to Natraj sir value
		course1.setFaculity("Natraj Sir");
		em.flush();

		Course course2 = new Course("Tools", "Subhakar");
		em.persist(course2);
		em.flush();
		//em.detach(course2);

		course2.setFaculity("JOHN");
		em.flush();

	}
	
	//JPQL Query
	//get all course using Query 
	public List<Course> getAllCourse(){
		Query query = em.createQuery("select c from Course c");
		List listcourse = query.getResultList();
		return listcourse;
	}
	
	//JPQL Query
	//get all Course using TypeQuery
	public List<Course> getAllCourseTypeQuery(){
		TypedQuery<Course> typedQuery = em.createQuery("select c from Course c where courseName like '%Spring Boot'",Course.class);
		List<Course> list = typedQuery.getResultList();
		return list;
	}
	
	//Native Query
	//get all course
	public List<Course> getAllCourseNativeQuery() {
		Query query = em.createNativeQuery("select * from Course",Course.class);
		List<Course> list = query.getResultList();
		return list;
	}
	
	public List<Course> getAllCourseNativeQueryWhereClause() {
		Query query = em.createNativeQuery("select * from Course where faculity=?",Course.class);
		query.setParameter(1, "Sriman Sir");
		List<Course> list = query.getResultList();
		
		return list;
	}
	
	public List<Course> getAllCourseNativeQueryWhereClauseNameParameter() {
		Query query = em.createNativeQuery("select * from Course where faculity= :teacher",Course.class);
		query.setParameter("teacher", "Sriman Sir");
		List<Course> list = query.getResultList();
		return list;
	}


}
