package com.atguigu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParamController {
	
	/**
	 * 在springMVC獲取客戶端傳遞的數據方式:
	 * 1. 在處理請求的方法中, 加入相對應的參數, 保證形參參數名和傳遞的數據的參數名保持一致,就可以自動賦值了
	 * value: 當不滿足賦值條件時, 可以使用value屬性, 指定映射關係
	 * required: 來設置形參是否必須被賦值, 默認為true, 必須賦值, 若設置false 則不必須賦值, 因此此形參的值為null
	 * defaultValue : 若形參所獲得的值為null, 則設置一個默認值, 用在分頁和模糊查詢中
	 * 
	 * @param username
	 * @param password
	 * @param age
	 * @param province
	 * @param city
	 * @param country
	 * @return
	 */
	
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestParam(value="name", required=false, defaultValue="GG"/*是null沒有這個屬性, 不是空字串*/) String username , String password, String age, String province, String city, String country) {
//		System.out.println("username: "+username + ", password: " + password+ ", age: " + age);
//		return "success";
//	}
	
	/**
	 * @RequestHeader: 在處理請求的方法上, 獲取請求頭訊息, 用法和@RequestParam 一樣
	 *
	 * @param AcceptLanguage
	 * @return
	 */
		
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@RequestHeader( "Accept-Language") String AcceptLanguage) {
//		System.out.println("AcceptLanguage: " + AcceptLanguage);
//		return "success";
//	}
	
	/**
	 * @CookieValue: 在處理請求的方法上, 獲取cookie訊息, 用法和@RequestParam 一樣
	 * 
	 * @param JSESSIONID
	 * @return
	 */
	
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(@CookieValue( "JSESSIONID") String JSESSIONID) {
//		System.out.println("JSESSIONID: " + JSESSIONID);
//		return "success";
//	}
	
	/**
	 * 可以使用POJO(VO) 獲取客戶端數據, 要求實體類對象中的屬性名一定要和頁面中表單元素的name屬性一致,且支持集聯關係
	 * 可以透過設置形參的方式, 獲取servletAPI
	 * @param user
	 * @return
	 */
	
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public String param(User user, HttpServletRequest req, HttpServletResponse res) {
//		System.out.println(req.getParameter("username"));
////		System.out.println(user);
//		return "success";
//	}
	
	
	/**
	 * springMVC處理請求過程中,往作用域中放值有以下三種方式
	 * 總結: 根據ModelAndView原碼調式, 不管使用以下哪種方式, 
			最終都會把model數據和view數據封裝到一個ModelAndView中
	 * 
	 * 
	 * @param model
	 * @return
	 */
		
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public ModelAndView param() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("username","root");//往request作用域放值
//		mav.setViewName("success");//設置視圖名稱實驗頁面跳轉
//		return mav;
//	}
	
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(String username, Map<String,Object> map) {
		System.out.println(username);
		map.put("username", "GGGG");//向作用域中放值
		return "success";//返回視圖名稱
	}

//	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(Model model) {
		model.addAttribute("username","PETER2");//向作用域中放值
		return "success";//返回視圖名稱
	}
}
