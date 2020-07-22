package com.cg.onlinebook.contoller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cg.Exceptions.BookIdException;
import com.cg.Exceptions.BookIdNotFoundException;
import com.cg.util.OrderConstraints;

@ControllerAdvice

public class BookStoreExceptionAdvice {
	


	
	@ExceptionHandler(value = {BookIdNotFoundException.class})
	@ResponseStatus(code= HttpStatus.NOT_FOUND)
	@ResponseBody
	public Map<String,String> handlerException1(Exception ex) {
		
		Map<String,String> map = new HashMap<>();
		map.put("message", OrderConstraints.BOOK_ID_NOT_Found);
		return map;
	}
	
	@ExceptionHandler(value = {BookIdException.class})
	@ResponseStatus(code= HttpStatus.BAD_REQUEST)
	@ResponseBody
	public Map<String,String> handlerException2(Exception ex) {
				Map<String,String> map = new HashMap<>();
		map.put("message", OrderConstraints.BOOK_Id_EXCEPTION);
		return map;

		
	}

}