package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RESTController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/testREST/{id}")
	public String getUserById(@PathVariable("id")Integer id) {
		System.out.println("GET,id= " + id);
		
		return "success";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/testREST")
	public String insertUser(Integer id) {
		System.out.println("POST, idD= " + id);
		
		return "success";
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/testREST")
	public String updateUser() {
		System.out.println("PUT");
		
		return "success";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/testREST/{id}")
	public String deleteUser(@PathVariable("id")Integer id) {
		System.out.println("DELETE,id= " + id);
		
		return "success";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/testAjax_DELETE")
	public void testAjax_DELETE(Integer id) {
		System.out.println("testAjax_DELETE, id= " + id);
		
	
	}
	
	
	

}
