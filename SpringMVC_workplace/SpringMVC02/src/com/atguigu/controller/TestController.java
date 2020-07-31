package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/mvc")
public class TestController {
	
	/**
	 * @RequestMapping:設置請求映射,把請求和控制層中的方法設置映射關係
	 * 當請求路徑和的value屬性值一致時,則該註解所標註的方法即為處理請求的方法
	 * 
	 * @RequestMapping可以加在類上,也可以加在方法上
	 * 兩者都有加,則一層一層訪問
	 * 
	 * 請求方式: GET 查詢  POST 添加  PUT  修改   DELETE 刪除
	 * params: 用來設置客戶端傳到服務器的數據, 支持表達式
	 * username, !username, usename = admin, username != admin
	 * headers:用來設置請求頭訊息,所發送的請求的請求頭訊息一定要和headers屬性中所設置的一致
	 */
	
//	@RequestMapping(value = "/test", method = RequestMethod.POST)
//	public String testPOST() {
//		System.out.println("SUCCESS:POST");
//		return "success";
//	}
		
	@RequestMapping(value = "/test"
//					,method = RequestMethod.GET
//					,params = {"username","!sex","age!=12"}
					,headers = {"Accept-Language=zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7,ja;q=0.6"}
	)
	public String testGET() {
		System.out.println("SUCCESS:GET");
		return "success";
		
	}
	/**
	 * springMVC支持Ant方式請求路徑
	 * 在Ant中, 有3種匹配符
	 * *:任意字符
	 * ?:任意一個字符
	 * **:任意多層目錄
	 * 
	 */
	
	@RequestMapping(value = "/*/ant??/**/testAnt")
	public String testAnt() {
		System.out.println("SUCCESS:testAnt");
		return "success";
	}
	
	/**
	 * 以前: localhost:8081/springMVC02/testRest?id=1001&username=admin
	 * 現在: localhost:8081/springMVC02/testRest/1001/admin
	 * 
	 * 
	 */
	
	@RequestMapping("/testRest/{id}/{username}")
	public String testRest(@PathVariable("id")Integer id, @PathVariable("username")String username
						  ) {
		
		System.out.println("id: " + id + ", username= " + username);
		 
		return "success";
	}
}
