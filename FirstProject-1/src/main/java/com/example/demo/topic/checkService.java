package com.example.demo.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class checkService {
@Autowired
	private callingObjectRepository cor;

	public List<callingObject> getServices()
	{
		List<callingObject> co=new ArrayList<>();
		cor.findAll();
		for(int i=0;i<co.size();i++)
		{
		co.addAll(i, co);		
		}
		
		return co;
	}
	public Object filtercall(String name)
	{
		return cor.findById(name);		
	}
	
	public void postMethod(callingObject ob) {
		cor.save(ob);
		
	}
	public void updateMethod(String name,callingObject ob) {
		cor.save(ob);
		
	}
	public void deleteMethod(String name, callingObject ob) {
	cor.delete(ob);
	}
}
