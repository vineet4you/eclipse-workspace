package com.example.webdev.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.webdev.pojo.Users;

public interface UsersRepository extends CrudRepository<Users , Integer> {

	public Iterable<Users> deleteByUsername(String username);
	public Users findByUsername(String username);
}
