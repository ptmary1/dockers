package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/all")
	public ResponseEntity<String> getfun()
	{
		return new ResponseEntity<String>("Welcome mary",HttpStatus.OK);
	}
}
