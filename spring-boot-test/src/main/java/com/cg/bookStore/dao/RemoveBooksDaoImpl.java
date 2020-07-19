package com.cg.bookStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.bookStore.entities.Admin;

@Repository
public class RemoveBooksDaoImpl implements RemoveBooksDao{
	
	@PersistenceContext
	private EntityManager em;

	public boolean removeBook(int bookId) {
    String jpql ="delete from OrderInformation p where p.book.bookId=:bid";
		
		Query query = em.createQuery(jpql);
		
		query.setParameter("bid", bookId);
		int res =query.executeUpdate();
		if(res > 0)
		return true;
		else
			return false;
		
	}

	public Admin viewAdmin(int adminId) {
		
		return em.find(Admin.class,adminId);
	}

}
