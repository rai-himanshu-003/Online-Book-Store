package com.cg.book.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	

	//Cancle Order.
			@Override
			public boolean findOrder(int orderId) {
				// TODO Auto-generated method stub
				return em.contains(em.find(OrderInformation.class, orderId));
				
			}



			@Override
			public void updateOrderStatus(int orderId, String orderStatus) {
				// TODO Auto-generated method stub
				em.find(OrderInformation.class, orderId).setOrderStatus(orderStatus);
			}


			@Override
			public OrderInformation getOrderDetails(int orderId) {
				// TODO Auto-generated method stub
				return em.find(OrderInformation.class, orderId);
			}
	//List of all Order


			//List of all Order
			@Override
			public List<OrderInformation> showListOrder() {
				// TODO Auto-generated method stub
				Query query= em.createQuery("from OrderInformation o");
				List<OrderInformation> orders = query.getResultList();
				return orders;
			}
			
			//Update customer details in order through admin			
			@Override
			public boolean updateOrderInfo(OrderInformation orderInfo) 
			{
				em.merge(orderInfo);
				return false;
			}

			@Override
			public OrderInformation getOrderById(int orderId) 
			{
				return em.find(OrderInformation.class, orderId);
			}

		

}









