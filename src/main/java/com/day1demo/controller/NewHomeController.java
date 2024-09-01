package com.day1demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.day1demo.dto.Users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class NewHomeController {
	@PostMapping("/save")
	public String saveUserData(@RequestBody Users users) {
		if(users.getUserName().equals("Tony")) {
		return "Valid username";
		}
	return"Invalid username";
}
}
