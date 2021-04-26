package com.example.revision;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

	
	@Id
	String name;
	String id;
	
	
	
	public Topic(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
/*	@Override
	public String toString() {
		return "Topic [name=" + name + ", id=" + id + "]";
	} */
}
