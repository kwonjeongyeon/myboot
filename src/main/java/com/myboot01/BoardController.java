package com.myboot01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      //restcontroller로 등록하면 리턴되는 문자열이 브라우저에 그대로 출력되기 때문에 별도로 view 화면을 만들 필요가 없다
public class BoardController {

	
	public BoardController() {
		System.out.println("==> BoardController 생성");
	}
	
	@GetMapping("/hi")           // 기존의 @RequestMapping(Value="/hi", method="RequestMethod.GET")과 동일한 설정
	public String hello(String name) {
		return "Hi : " + name ;
	}
}
