package com.ddq.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddq.dao.UserDao;

@RestController
public class HelloWorldController {

	@Autowired
	UserDao userDao;
	
	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}

	@GetMapping("/getUser")
	public List<Map<String,Object>> getUsers() {
		return userDao.findAll();
	}
}