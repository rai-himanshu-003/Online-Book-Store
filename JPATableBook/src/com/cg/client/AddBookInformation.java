package com.cg.client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookStore.entities.BookInformation;

public class AddBookInformation {

	public static void main(String[] args) {
		
		BookInformation book1 = new BookInformation();
		book1.setTitle("The Complete Reference Java 2");
		book1.setAuthor("Herb Schildt");
		book1.setIsbnNumber("0070495432");
		book1.setPublishDate(LocalDate.of(2012, 12, 05));
		book1.setDescription("This definitive guide contains "
				+ "complete details on the Java language, its class libraries, "
				+ "and its development environment along with hundreds of examples "
				+ "and expert techniques.");
		book1.setLastUpdateTime(LocalDate.of(2014, 02, 9));
	
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = null;

		try {

			tx = em.getTransaction();
			tx.begin();
			em.persist(book1);
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
