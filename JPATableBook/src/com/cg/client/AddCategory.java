package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookStore.entities.BookCategory;

public class AddCategory {


	public static void main(String[] args) {
		BookCategory ctg1 = new BookCategory();
		ctg1.setCategoryName("History");
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = null;

		try {

			tx = em.getTransaction();
			tx.begin();
			em.persist(ctg1);
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
