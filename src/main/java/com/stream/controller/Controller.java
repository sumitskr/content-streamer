package com.stream.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(value="/content_stream/api/v1/")
public class Controller {
	
	
	
	@GetMapping("/dev")
	public String developer() {
		return "Hello From Sumit Sarkar";
	}
	
}
