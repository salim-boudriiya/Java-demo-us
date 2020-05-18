package com.example.us.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public String get(@PathVariable("id") String id) {
		return "prueba";
	}
}
