package com.cg;

import static org.junit.Assert.assertEquals;

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
	
	
	@Test
	public void checkOrderNotExist()
	{
		boolean val=false;
		assertEquals(val,"");
	}
	
	@Test
	public void checkOrderExist()
	{
		boolean val=true;
		assertEquals(val,"234567");
	}
}
	
	
	
	