package com.cg.book.service;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cg.book.dao.BookDao;
import com.cg.book.entity.OrderInformation;
import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;
import com.cg.Exceptions.OrdersException;
import com.cg.util.OrderConstraints;



@Service("Orderser")
@Transactional
public class BookServiceImpl implements BookService{


	@Autowired
	private BookDao dao;
	
	@Transactional
	@Override
	public OrderInformation viewOrderDetails(int orderId) throws OrdersException {
	
		OrderInformation order = dao.viewOrderDetails(orderId);
		System.out.println("dkjfhdfdhhfhfshdjsjk");
		if(order==null)
			throw new OrdersException(OrderConstraints.INVALID_ORDERID);
		return order;
	}
	
	
	
	
	
	
	
}