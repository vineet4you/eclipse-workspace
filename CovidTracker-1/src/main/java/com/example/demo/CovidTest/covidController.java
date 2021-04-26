package com.example.demo.CovidTest;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class covidController {

 private RestTemplate rt=new RestTemplate();
	@GetMapping("/test")
	
/*	public ResponseEntity<String> getDetails()
	{
		String baseUrl="https://api.covid19india.org/data.json";
		HttpHeaders headers=new HttpHeaders();		//Header class is used to pass content type,etc
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<String> requestEntity=new HttpEntity<>(headers);		//this is for Request body;refer postman
		ResponseEntity<String> obj=rt.exchange(baseUrl, HttpMethod.GET, requestEntity, String.class);
		return obj;
	}*/
	
	public Example getDetails() throws JsonProcessingException
	{
		String baseUrl="https://api.covid19india.org/data.json";
		HttpHeaders headers=new HttpHeaders();		//Header class is used to pass content type,etc
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<Object> requestEntity=new HttpEntity<>(headers);		//this is for Request body;refer postman
		ResponseEntity<Example> ob=rt.exchange(baseUrl, HttpMethod.GET, requestEntity, Example.class);
		return ob.getBody();

	}
	
	
}
