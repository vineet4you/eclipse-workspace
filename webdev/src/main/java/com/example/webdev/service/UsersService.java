package com.example.webdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdev.pojo.Users;
import com.example.webdev.repo.UsersRepository;

@Service
public class UsersService {

	
	@Autowired
	private UsersRepository repo;
	
	public UsersService() {}
	
	public UsersService(UsersRepository repo) {
		super();
		this.repo = repo;
	}

	public void saveUser(Users user)
	{
		repo.save(user);
		
	}

	public Iterable<Users> getUser() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	/* public void deleteUser(String username, Users user )
	{
		repo.delete(user);
	}*/
	public Iterable<Users> deleteByUsername(String username)
	{
		repo.deleteByUsername(username);
		return repo.findAll();
	}

	public Users findByUsername(String username) {
		// TODO Auto-generated method stub
		return repo.findByUsername(username);
	}
}
