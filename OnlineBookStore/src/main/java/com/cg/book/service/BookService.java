package com.cg.book.service;

import com.cg.book.entity.OrderInformation;

import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;
import com.cg.Exceptions.OrdersException;

public interface BookService {
	public OrderInformation viewOrderDetails(int orderId)throws OrdersException;
	

	
}
 
