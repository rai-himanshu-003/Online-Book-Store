package com.cg.book.service;

import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;


public interface RemoveBookFromOrderService {
	

	public boolean removeBook(String bookId)throws BookIdException,BookIdNotFoundException;
}
