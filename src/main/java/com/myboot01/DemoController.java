package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/") // 모든 요청 처리
	public String home() {
		System.out.println("Hello Boot!!");
		return "Hello Boot!!"; // 브라우저 출력
	}

	@RequestMapping("/hello.do")
	public String hello() {
		return "hello";
	}

	@RequestMapping("/aju.do")
	public String svt(Model model) {
		model.addAttribute("aju", "nice");

		return "hello2";
	}

	@RequestMapping("/hi.do")
	public String hi(Model model) {
		System.out.println("안녕하세요");
		model.addAttribute("message", "hi.jsp입니다!");
		return "hi";
	}
}
