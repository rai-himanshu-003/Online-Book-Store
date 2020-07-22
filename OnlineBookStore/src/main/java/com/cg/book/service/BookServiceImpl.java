package com.cg.book.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.Exceptions.OrdersException;
import com.cg.book.dao.BookDao;
import com.cg.book.entity.OrderInformation;
import com.cg.util.OrderConstraints;



@Service("Orderser")
@Transactional
public class BookServiceImpl implements BookService{


	@Autowired
	private BookDao dao;
	
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	
	@Override
	public OrderInformation viewOrderDetails(int orderId) throws OrdersException {
	
		OrderInformation order = dao.viewOrderDetails(orderId);
		if(order==null)
			throw new OrdersException(OrderConstraints.INVALID_ORDERID);
		return order;
	}
	
	@Override
	public boolean findOrderById(int orderId) {
		// TODO Auto-generated method stub
		return dao.findOrder(orderId);
	}

	@Override
	public String cancleOrder(int orderId) {
	
		OrderInformation orderDetails=new OrderInformation();
		orderDetails=dao.getOrderDetails(orderId);
		
		if(orderDetails.getOrderStatus().equals("Processing"))
		{
			dao.updateOrderStatus(orderId, "Cancelled");
			return "Order is Cancelled";
		}
		else if(orderDetails.getOrderStatus().equals("Cancelled"))
		{
			return "Order is already Cancelled";
		}
		else if(orderDetails.getOrderStatus().equals("shipped"))
		{
			return "Cannot Cancelled Order, Order is already Shipped";
		}
		return null;
	}



	@Override
	public List<OrderInformation> showOrderList() {
		// TODO Auto-generated method stub
		return dao.showListOrder();
	}


	// Update Customer Information
	
		@Override
		public boolean updateShippingAddress(int orderId, String newAddress) 
		{
			OrderInformation order = dao.getOrderById(orderId);
			order.setShippingAddress(newAddress);
			dao.updateOrderInfo(order);
			return true;
		}

		@Override
		public boolean updateOrderStatus(int orderId, String status) {
			OrderInformation order = dao.getOrderById(orderId);
			order.setOrderStatus(status);
			dao.updateOrderInfo(order);
			return true;
		}
		
		
	
	
}