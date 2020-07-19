package com.cg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.bookStore.dao.RemoveBooksDao;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {
	
	@Autowired
	RemoveBooksDao dao;
	
	/*
	@Test
	public void checkOrderNotExist()
	{
		String bookId="";
		when(dao.removeBook(bookId)).thenReturn(false);
		assertEquals(false, dao.removeBook(bookId));
	}
	
	@Test
	public void checkOrderExist()
	{
		String bookId="12345";
		when(dao.removeBook(bookId)).thenReturn(true);
		assertEquals(true, dao.removeBook(bookId));
	}
	@Test
	public void checkOrder()
	{
		String bookId="@%#@%^@&#@^*&*&";
		when(dao.removeBook(bookId)).thenReturn(false);
		assertEquals(false, dao.removeBook(bookId));
	}
	@Test
	public void checkOrder2()
	{
		String bookId="23482458734529";
		when(dao.removeBook(bookId)).thenReturn(false);
		assertEquals(false, dao.removeBook(bookId));
	}
	
*/

}
	
	
	
	