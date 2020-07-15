package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookStore.entities.Admin;

public class AddAdmin {

	public static void main(String[] args) {
		Admin admin1 = new Admin();
		admin1.setFullName("Himanshu Rai");
		admin1.setPassword("hr12345");
		admin1.setEmail("rai.ashu003@gmail.com");
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = null;

		try {

			tx = em.getTransaction();
			tx.begin();
			em.persist(admin1);
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

