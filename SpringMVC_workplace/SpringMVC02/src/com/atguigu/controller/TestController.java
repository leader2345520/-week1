package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//@RequestMapping("/mvc")
public class TestController {
	
	/**
	 * @RequestMapping:�]�m�ШD�M�g,��ШD�M����h������k�]�m�M�g���Y
	 * ��ШD���|�M��value�ݩʭȤ@�P��,�h�ӵ��ѩҼе�����k�Y���B�z�ШD����k
	 * 
	 * @RequestMapping�i�H�[�b���W,�]�i�H�[�b��k�W
	 * ��̳����[,�h�@�h�@�h�X��
	 * 
	 * �ШD�覡: GET �d��  POST �K�[  PUT  �ק�   DELETE �R��
	 * params: �Ψӳ]�m�Ȥ�ݶǨ�A�Ⱦ����ƾ�, �����F��
	 * username, !username, usename = admin, username != admin
	 * headers:�Ψӳ]�m�ШD�Y�T��,�ҵo�e���ШD���ШD�Y�T���@�w�n�Mheaders�ݩʤ��ҳ]�m���@�P
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
	 * springMVC���Ant�覡�ШD���|
	 * �bAnt��, ��3�ؤǰt��
	 * *:���N�r��
	 * ?:���N�@�Ӧr��
	 * **:���N�h�h�ؿ�
	 * 
	 */
	
	@RequestMapping(value = "/*/ant??/**/testAnt")
	public String testAnt() {
		System.out.println("SUCCESS:testAnt");
		return "success";
	}
	
	/**
	 * �H�e: localhost:8081/springMVC02/testRest?id=1001&username=admin
	 * �{�b: localhost:8081/springMVC02/testRest/1001/admin
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
