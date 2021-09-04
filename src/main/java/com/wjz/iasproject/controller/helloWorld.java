package com.wjz.iasproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class helloWorld {
	@RequestMapping("")
	public String helloWord() {
		return "hello SB";
	}
}
