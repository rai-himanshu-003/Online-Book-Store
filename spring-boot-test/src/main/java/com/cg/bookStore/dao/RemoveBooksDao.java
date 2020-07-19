package com.cg.bookStore.dao;

import com.cg.bookStore.entities.Admin;

public interface RemoveBooksDao{
	
	public boolean removeBook(int bookId);
	public Admin viewAdmin(int adminId);

}
