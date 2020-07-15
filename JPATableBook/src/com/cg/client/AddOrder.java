package com.cg.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cg.bookStore.entities.BookCategory;
import com.cg.bookStore.entities.CustomerInformation;
import com.cg.bookStore.entities.Order;

public class AddOrder {

	public static void main(String[] args) {
		
		Order order1 = new Order();
		order1.setOrderStatus("shipped");
		order1.setPaymentMethod("Cash On Delivery");
		order1.setShippingAddress("Village-Jamsar, Azamgarh");
		order1.setSubTotal(235);
		order1.setTotal(235);
		order1.setQuantity(1);
		CustomerInformation cust1 = new CustomerInformation();
		cust1.setCustomerId(20);
		order1.setCustomerDetails(cust1);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-CRUD");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = null;

		try {

			tx = em.getTransaction();
			tx.begin();
			em.persist(order1);
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
