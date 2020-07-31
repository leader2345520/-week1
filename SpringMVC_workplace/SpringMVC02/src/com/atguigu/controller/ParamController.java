package com.atguigu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ParamController {
	
	/**
	 * �bspringMVC����Ȥ�ݶǻ����ƾڤ覡:
	 * 1. �b�B�z�ШD����k��, �[�J�۹������Ѽ�, �O�ҧΰѰѼƦW�M�ǻ����ƾڪ��ѼƦW�O���@�P,�N�i�H�۰ʽ�ȤF
	 * value: ��������ȱ����, �i�H�ϥ�value�ݩ�, ���w�M�g���Y
	 * required: �ӳ]�m�ΰѬO�_�����Q���, �q�{��true, �������, �Y�]�mfalse �h���������, �]�����ΰѪ��Ȭ�null
	 * defaultValue : �Y�ΰѩ���o���Ȭ�null, �h�]�m�@���q�{��, �Φb�����M�ҽk�d�ߤ�
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
//	public String param(@RequestParam(value="name", required=false, defaultValue="GG"/*�Onull�S���o���ݩ�, ���O�Ŧr��*/) String username , String password, String age, String province, String city, String country) {
//		System.out.println("username: "+username + ", password: " + password+ ", age: " + age);
//		return "success";
//	}
	
	/**
	 * @RequestHeader: �b�B�z�ШD����k�W, ����ШD�Y�T��, �Ϊk�M@RequestParam �@��
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
	 * @CookieValue: �b�B�z�ШD����k�W, ���cookie�T��, �Ϊk�M@RequestParam �@��
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
	 * �i�H�ϥ�POJO(VO) ����Ȥ�ݼƾ�, �n�D��������H�����ݩʦW�@�w�n�M��������椸����name�ݩʤ@�P,�B������p���Y
	 * �i�H�z�L�]�m�ΰѪ��覡, ���servletAPI
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
	 * springMVC�B�z�ШD�L�{��,���@�ΰ줤��Ȧ��H�U�T�ؤ覡
	 * �`��: �ھ�ModelAndView��X�զ�, ���ިϥΥH�U���ؤ覡, 
			�̲׳��|��model�ƾکMview�ƾګʸ˨�@��ModelAndView��
	 * 
	 * 
	 * @param model
	 * @return
	 */
		
//	@RequestMapping(value="/param", method=RequestMethod.POST)
//	public ModelAndView param() {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("username","root");//��request�@�ΰ���
//		mav.setViewName("success");//�]�m���ϦW�ٹ��筶������
//		return mav;
//	}
	
	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(String username, Map<String,Object> map) {
		System.out.println(username);
		map.put("username", "GGGG");//�V�@�ΰ줤���
		return "success";//��^���ϦW��
	}

//	@RequestMapping(value="/param", method=RequestMethod.POST)
	public String param(Model model) {
		model.addAttribute("username","PETER2");//�V�@�ΰ줤���
		return "success";//��^���ϦW��
	}
}
