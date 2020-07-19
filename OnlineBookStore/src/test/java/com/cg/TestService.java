package com.cg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;
import com.cg.book.service.RemoveBookFromOrderService;

	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class TestService {
		
		@Autowired
		RemoveBookFromOrderService ser;
		
		
		@Test
		public void checkOrderNotExist() throws BookIdException,BookIdNotFoundException
		{
			String bookId="";
			when(ser.removeBook(bookId)).thenReturn(false);
			assertEquals(false, ser.removeBook(bookId));
		}
		
		@Test
		public void checkOrderExist() throws BookIdException, BookIdNotFoundException
		{
			String bookId="200";
			when(ser.removeBook(bookId)).thenReturn(true);
			assertEquals(true, ser.removeBook(bookId));
		}
		@Test
		public void checkOrder() throws BookIdException,BookIdNotFoundException
		{
			String bookId="@%#@";
			when(ser.removeBook(bookId)).thenReturn(false);
			assertEquals(false, ser.removeBook(bookId));
		}
		@Test
		public void checkOrder2() throws BookIdException,BookIdNotFoundException
		{
			String bookId="2348";
			when(ser.removeBook(bookId)).thenReturn(false);
			assertEquals(false, ser.removeBook(bookId));
		}
}
