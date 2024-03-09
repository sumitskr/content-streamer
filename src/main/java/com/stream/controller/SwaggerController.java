package com.stream.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping(value = "/api/v1/doc")
public class SwaggerController {
	@GetMapping("/")
	public RedirectView apiDoc() {
		RedirectView redirectView = new RedirectView();
		redirectView.setContextRelative(true);
		redirectView.setUrl("/swagger-ui/index.html#/");
		return redirectView; 
	}
}
