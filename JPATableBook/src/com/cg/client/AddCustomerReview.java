package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.CustomerReview;

public class AddCustomerReview {

	public static void main(String[] args) {
	
		CustomerReview review1 = new CustomerReview();
		review1.setBookRating(4);
		review1.setReviewComment("nice book");
		review1.setReviewHeadling("good for programming");
		review1.setRatingId(229);
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = null;

		try {

			tx = em.getTransaction();
			tx.begin();
			em.persist(review1);
			tx.commit();
			System.out.println("row inserted");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			if(tx != null)
				tx.rollback();
		}
		System.out.println("table created");

		em.close();
		emf.close();

	}

	}


