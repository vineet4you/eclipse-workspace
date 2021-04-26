package com.example.demo.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class callingObject {

	@Id
	private String name;
	private int age;
	
	
	public callingObject(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
