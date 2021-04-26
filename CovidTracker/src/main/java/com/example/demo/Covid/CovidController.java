package com.example.demo.Covid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/test")
public class CovidController {

private RestTemplate rt=new RestTemplate();

@GetMapping("/list")
public ModelAndView display() throws JsonProcessingException
{

	
	ModelAndView mv=new ModelAndView("CovidUI");
	String baseURL="https://api.covid19india.org/data.json";
	Example obj= rt.getForObject(baseURL, Example.class);
	ObjectMapper abc=new ObjectMapper();
	String dis =abc.writeValueAsString(obj);
	mv.addObject("dis", dis);
	return mv;
}
}
