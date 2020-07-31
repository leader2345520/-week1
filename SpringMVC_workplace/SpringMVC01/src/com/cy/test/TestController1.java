package com.cy.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	/**
	 * localhost:8081/SpringMVC01/hello
	 * 
	 */
	@RequestMapping("hello")
	public String hello() {
		System.out.println("success");
		return "success";
	}

}
