package com.learn.otm.test;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.learn.otm.dao.ProductDao;
import com.learn.otm.dao.ReviewDao;
import com.learn.otm.entities.Product;
import com.learn.otm.entities.Review;

public class OneToManyHibernateConfigTest {

	public static void main(String[] args) {
		
		ProductDao productDao = null;
		ReviewDao reviewDao = null;
		Product product = null;
		Set<Review> setReview = new HashSet<>();
		
		productDao = new ProductDao();
		reviewDao = new ReviewDao();
		
		Review review1 = new Review();
		review1.setComment("Achar is very nice.");
		review1.setRating(5);
		review1.setReviewBy("Smith");
		review1.setReviewPostedDate(new Date());
		int reviewNo = reviewDao.saveReview(review1);
		System.out.println("Review no 1:"+reviewNo);
		
		Review review2 = new Review();
		review2.setComment("Achar is taste is awesome.");
		review2.setRating(4);
		review2.setReviewBy("John");
		review2.setReviewPostedDate(new Date());
		int reviewNo2 = reviewDao.saveReview(review2);
		System.out.println("Review no 2:"+reviewNo2);
		
		setReview.add(review1);
		setReview.add(review2);
		
		product = new Product();
		product.setAmount(452);
		product.setDescription("Achar");
		product.setManufacture("By Local Company");
		product.setProductName("Sasse Or Bhau Achar");
		product.setProductReviews(setReview);
		int productNo = productDao.saveProduct(product);
		System.out.println("Product No detail:"+productNo);
	}
}
