package com.ddq.admin.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddq.dao.UserDao;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/admin")
public class UserController {
	@Autowired
	UserDao userDao;

	@GetMapping("/getUsers")
	public List<Map<String, Object>> getUsers() {
		return userDao.findAll();
	}
}
