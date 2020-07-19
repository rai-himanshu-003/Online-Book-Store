package com.cg.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;
import com.cg.book.dao.RemoveBookFromOrderDao;
import com.cg.util.OrderConstraints;


@Service
public class RemoveBookFromOrderServiceImpl implements RemoveBookFromOrderService {

	@Autowired
	private RemoveBookFromOrderDao dao;
	
		@Transactional
     public boolean removeBook(String bookId) throws BookIdException, BookIdNotFoundException {
	
		if(!bookId.matches("^[0-9]*$"))
			throw new BookIdException(OrderConstraints.BOOK_Id_EXCEPTION);
		
		else if(dao.removeBook(Integer.parseInt(bookId))!=true)
			throw new BookIdNotFoundException(OrderConstraints.BOOK_ID_NOT_Found);
		 
		else
			 dao.removeBook(Integer.parseInt(bookId));
		    return true;
		}
		
}
