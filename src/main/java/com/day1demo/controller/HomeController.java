package com.day1demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class HomeController {
	
@GetMapping("/users")

public Map<String, String> getUser() {
	Map<String,String> user=new HashMap<>();
	user.put("name", "Gayu");
	user.put("address", "salem");
	user.put("age","21");
	return user;
}
	@GetMapping("/mark")
	public int addMark(@RequestParam ("a") int ob1 ,@RequestParam("b")int ob2) {
		return  ob1+ob2;
	}
	@GetMapping("/sub")
	public int subMark(@RequestParam ("c") int ob3 ,@RequestParam("d")int ob4) {
		return  ob3-ob4;
	}
	@GetMapping("/mult{e}*{f}")
	public int multi(@PathVariable ("e") int ob5 ,@PathVariable("f")int ob6) {
		return  ob5*ob6;
	}	
}