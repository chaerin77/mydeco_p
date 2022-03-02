package com.mydeco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	public String test() {
		System.out.println("test");
		return "user/modifyForm";
	}
	
	@RequestMapping("/mydiary")
		public String mydiary() {
			System.out.println("mydiary");
			return "mydiary/List";
		}
	
}
