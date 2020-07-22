package com.cg.book.dao;

import java.util.List;

import com.cg.book.entity.OrderInformation;


public interface BookDao {

	public OrderInformation viewOrderDetails(int orderId);

	
	//Cancle Order
		public boolean findOrder(int orderId);
		public OrderInformation getOrderDetails(int orderId);
		public void updateOrderStatus(int orderId,String orderStatus);
		
		//List all order
		public List<OrderInformation> showListOrder();
	
		//Update Customer Information
				public OrderInformation getOrderById(int orderId);
				public boolean updateOrderInfo(OrderInformation orderInfo);
}
