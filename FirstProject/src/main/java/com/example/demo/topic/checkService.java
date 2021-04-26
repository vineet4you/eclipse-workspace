package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class checkService {

	public List<callingObject> topic =new ArrayList <> (Arrays.asList(
			new callingObject("Vineet",26),		
			new callingObject("Shubham",25),
			new callingObject("Banke",24)
			));
	public List<callingObject> getServices()
	{
		return topic;
	}
	public callingObject filtercall(String name)
	{
		return topic.stream().filter(t->t.getName().equals(name)).findFirst().get();		
	}
	
	public void postMethod(callingObject ob) {
		topic.add(ob);
		
	}
	public void updateMethod(String name,callingObject ob) {
		for(int i=0;i<topic.size();i++)
		{
			callingObject ob1=topic.get(i);
			if(ob1.getName().equals(name))
			{
				topic.set(i,ob);
				return;
			}
		}
		
	}
	public void deleteMethod(String name, callingObject ob) {
		for(int i=0;i<topic.size();i++)
		{
			callingObject ob1=topic.get(i);
			if(ob1.getName().equals(name))
			{
				topic.remove(i);
				return;
			}
		}
		
	}
}
