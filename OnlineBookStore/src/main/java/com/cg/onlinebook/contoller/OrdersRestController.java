package com.cg.onlinebook.contoller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


	//Cancle Order
	
		@GetMapping("/CancleOrder/{orderId}")
		public ResponseEntity<String> DepositSlip(@PathVariable int orderId)  {
			String result="Order Id Not Found";
			if(service.findOrderById(orderId))
			{
				
				result=service.cancleOrder(orderId);
				return new ResponseEntity<String>(result,HttpStatus.OK);
				 
			}
			else
				return new ResponseEntity<String>(result,HttpStatus.OK);
			
			
		}
		
		//List Order
		@GetMapping("/listOrders")
		public ResponseEntity<List<OrderInformation>> showOrder()
		{
			// add Exception 
			return new ResponseEntity<List<OrderInformation>>(service.showOrderList(),HttpStatus.OK);
			
		}
		
		
		// test
		//update.updateShippingAddress(121,"Vikas Nagar");
		
		@PutMapping("/update_cust_det_address/{orderId}")
		public void updateShippingAddress(@PathVariable int orderId, @RequestBody OrderInformation orderInfo)    
		{
			service.updateShippingAddress(orderId, orderInfo.getShippingAddress());
	    }
		
		@PutMapping("/update_cust_det_status/{orderId}")
		public void updateOrderStatus(@PathVariable int orderId, @RequestBody OrderInformation orderInfo)    
		{
			service.updateOrderStatus(orderId, orderInfo.getOrderStatus());
	    }


		}
	
