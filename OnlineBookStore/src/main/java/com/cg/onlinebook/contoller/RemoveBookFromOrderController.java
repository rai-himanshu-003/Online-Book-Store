package com.cg.onlinebook.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;
import com.cg.book.service.RemoveBookFromOrderService;


@RestController
public class RemoveBookFromOrderController {

	@Autowired
	private RemoveBookFromOrderService ser;

	
	/****************************
	 * Method: deleteBook Description: To delete a book by book id from order
	 * @return                   String
	 * @exception                BookIdNotFoundException, BookIdException
	 * CreatedDate               17- JULY 2020
	 * CreatedBy                 Himanshu Rai
	 ****************************/

	@DeleteMapping("/deletebook/{bookId}")
	public String deleteBook(@PathVariable("bookId")String bookId)throws BookIdException,
	BookIdNotFoundException{
		
	    	ser.removeBook(bookId);
	     	return "Successfully Deleted";
	
		
}
	
}
