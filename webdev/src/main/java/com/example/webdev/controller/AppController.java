package com.example.webdev.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdev.pojo.Users;
import com.example.webdev.service.UsersService;
@RestController
public class AppController {

	@Autowired
	private UsersService service;
	
	@PostMapping("/save-user")
	@Transactional
	public String saveUser(@RequestBody Users user)
	{
		service.saveUser(user);
		return "Hello" + user.getFirstname() + "Welcome!";
	}
	
	@GetMapping("/get-user")
	public Iterable<Users> getUser()
	{
		return service.getUser();
	}
	
/*	@RequestMapping(method=RequestMethod.DELETE ,value= "/delete{username}")
	public void deleteUsers(@PathVariable String username, @RequestBody Users user)
	{
		service.deleteUser(username, user);
	} */
	
	@GetMapping("/delete/{username}")
	@Transactional
	public Iterable<Users> deleteByUsername(@PathVariable String username)
	{
		return service.deleteByUsername(username);
	}
	
	@GetMapping("/search/{username}")
	@Transactional
	public Users findByUsername(@PathVariable String username)
	{
		return service.findByUsername(username);
	}
	
	}
	
