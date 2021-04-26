package com.example.demo.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller

public class mvController {

	RestTemplate rt=new RestTemplate();
	
	
	@RequestMapping("/check")
	
	public ModelAndView display() throws RestClientException, JsonProcessingException
	{
		ModelAndView mv=new ModelAndView("test");
		String base="https://api.covid19india.org/data.json";
		ObjectMapper om=new ObjectMapper();
		String st=om.writeValueAsString(rt.getForObject(base, String.class));		
		return mv.addObject("st", st);
	}
}
