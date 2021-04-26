package com.example.demo.forms;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FormFields {
@Id
	private int cid;
	private String cname;
	private String cmail;
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCmail() {
		return cmail;
	}
	public void setCmail(String cmail) {
		this.cmail = cmail;
	}
	@Override
	public String toString() {
		return "FormFields [cname=" + cname + ", cid=" + cid + ", cmail=" + cmail + "]";
	}
	
	
}
