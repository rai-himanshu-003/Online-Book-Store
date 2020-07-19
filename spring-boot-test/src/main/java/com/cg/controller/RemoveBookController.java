package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.Exceptions.BookIdException;
import com.cg.bookStore.entities.Admin;
import com.cg.bookStore.service.RemoveBooksService;

@RestController
public class RemoveBookController {

	@Autowired
	RemoveBooksService ser;
	
	
	
	@CrossOrigin(origins = {"http://localhost:4200"}) 
	@DeleteMapping("/deletebook/{bookId}")
	public String deleteBook(@PathVariable("bookId")String bookId)throws BookIdException{
		ser.removeBook(bookId);
		return "Successfully Deleted";
		
}
	@GetMapping("view/{adminId}")
	public Admin viewAdmin(@PathVariable("adminId")int adminId) {
		 return ser.viewAdmin(adminId);
	}
}