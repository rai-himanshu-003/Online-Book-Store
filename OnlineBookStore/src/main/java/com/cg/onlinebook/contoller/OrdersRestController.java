package com.cg.onlinebook.contoller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Exceptions.OrdersException;
import com.cg.book.entity.OrderInformation;
import com.cg.book.service.BookService;



@RestController
public class OrdersRestController {

	@Autowired
	public BookService service;

	@GetMapping("/viewOrderDetailsById/{orderId}")
	public OrderInformation viewOrderDetails(@PathVariable("orderId") int orderId) throws OrdersException {

		OrderInformation order = service.viewOrderDetails(orderId);
		return order;	
		
	}

		}
	
