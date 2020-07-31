package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	/**
	 * View 類型:
	 * IternalResourceView: 轉發視圖
	 * JstlView: 轉發視圖
	 * RedirectView: 重新定向視圖
	 * 
	 * @return
	 */
	
	@RequestMapping(value ="/test" , method = RequestMethod.POST)
	public String test(String username) {
//		return "redirect:/index.jsp";
		System.out.println(username);
		return "success";
	}
}
