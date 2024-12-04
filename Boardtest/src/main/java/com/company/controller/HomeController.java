package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;


@Controller
@Log4j
public class HomeController {
	
	@RequestMapping({ "", "/" }) 	/* 복수개의 url을 지정할 때  */
	public String home() {
		log.info("Welcome home!");
		return "index";
	}
	
}
