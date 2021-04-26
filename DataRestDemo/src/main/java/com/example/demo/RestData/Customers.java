package com.example.demo.RestData;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

	@Id
	private int cid;
	private String cname;
	private String coursename;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", coursename=" + coursename + "]";
	}
	
}
