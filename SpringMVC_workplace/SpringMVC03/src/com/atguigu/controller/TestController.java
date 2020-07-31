package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class TestController {
	
	/**
	 * View ����:
	 * IternalResourceView: ��o����
	 * JstlView: ��o����
	 * RedirectView: ���s�w�V����
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
