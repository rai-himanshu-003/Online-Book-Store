package com.cg.bookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.Exceptions.BookIdException;
import com.cg.bookStore.dao.RemoveBooksDao;
import com.cg.bookStore.entities.Admin;
@Service
public class RemoveBooksSerImpl implements RemoveBooksService {
	
	
	@Autowired
	RemoveBooksDao dao;
	
    
	public boolean removeBook(String bookId) throws BookIdException {
		
		if(!bookId.matches("[0-9]"))
			throw new BookIdException("Book Id must be a number");
		else
		dao.removeBook(Integer.parseInt(bookId));
		return true;
	}


	public Admin viewAdmin(int adminId) {
		return dao.viewAdmin(adminId);
	
	}

}
