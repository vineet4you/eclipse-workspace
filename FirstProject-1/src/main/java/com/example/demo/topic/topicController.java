package com.example.demo.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class topicController {
	
	@Autowired
	private checkService cService;

@RequestMapping("/topics")
public List<callingObject> checkService()
{
return cService.getServices();	
}
@RequestMapping("/topics/{name}")
public Object filterCall(@PathVariable String name)
{
	return cService.filtercall(name);
}
@RequestMapping(method = RequestMethod.POST, value = "/topics")
public void post(@RequestBody callingObject ob)
{
	cService.postMethod(ob);
}
@RequestMapping(method = RequestMethod.PUT, value = "/topics{name}")
public void post(@RequestBody callingObject ob, @PathVariable String name)
{
	cService.updateMethod(name,ob);
}
@RequestMapping(method = RequestMethod.DELETE, value = "/topics{name}")
public void del(@RequestBody callingObject ob, @PathVariable String name)
{
	cService.deleteMethod(name,ob);
}
}
