package com.cg.book.dao;

import com.cg.book.entity.OrderInformation;


public interface BookDao {

	public OrderInformation viewOrderDetails(int orderId);
	
	

}
