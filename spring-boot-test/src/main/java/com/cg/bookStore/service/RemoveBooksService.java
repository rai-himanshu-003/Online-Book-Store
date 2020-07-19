package com.cg.bookStore.service;

import com.cg.Exceptions.BookIdException;
import com.cg.bookStore.entities.Admin;

public interface RemoveBooksService {
	
	public boolean removeBook(String bookId)throws BookIdException;
	public Admin viewAdmin(int adminId);

}
