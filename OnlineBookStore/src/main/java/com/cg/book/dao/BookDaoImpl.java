package com.cg.book.dao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.book.entity.OrderInformation;


@Repository
public class BookDaoImpl implements BookDao{

	@PersistenceContext
	private EntityManager em;
		
	
	@Override
	public OrderInformation viewOrderDetails(int orderId) {
		return em.find(OrderInformation.class,orderId);
	}
	

		

}









