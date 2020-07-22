package com.cg.book.service;

import java.util.List;

import com.cg.Exceptions.OrdersException;
import com.cg.book.entity.OrderInformation;

public interface BookService {
	public OrderInformation viewOrderDetails(int orderId)throws OrdersException;
	
	
	

	//cancle Order.
	public boolean findOrderById(int orderId);
	public String cancleOrder(int orderId);
	
	//list order
	public List<OrderInformation> showOrderList();
	

	//Update Customer Information
	public boolean updateShippingAddress(int orderId,String newAddress);
	public boolean updateOrderStatus(int orderId,String status);
	
	
}
 
