package com.example.demo.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
@RequestMapping("/hello")
public String check() {
	return "Hello Frands";
}
}
