package com.cg.client;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookStore.entities.CustomerInformation;

public class AddCustomer {

	public static void main(String[] args) {
		CustomerInformation cust1 = new CustomerInformation();
		cust1.setFullName("Himanshu Rai");
		cust1.setEmailAddress("rai.ashu003@gmail.com");
		cust1.setCity("Azamgarh");
		cust1.setPassword("hr12345");
		cust1.setPhoneNumber("7007928591");
		cust1.setCountry("INDIA");
		cust1.setZipCode(276136);
		cust1.setRegisterDate(LocalDate.of(2020, 01, 05));
	
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = null;

		try {

			tx = em.getTransaction();
			tx.begin();
			em.persist(cust1);
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
