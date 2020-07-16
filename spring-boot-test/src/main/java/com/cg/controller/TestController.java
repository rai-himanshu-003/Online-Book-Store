package com.cg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.entities.Admin;


@RestController
public class TestController {

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public Admin firstPage() {

		Admin admin = new Admin();
		admin.setEmail("rai.ashu003@gmail.com");
		admin.setFullName("Himanshu Rai");
		admin.setPassword("hr12345");
		admin.setAdminId(1001);

		return admin;
	}

}

