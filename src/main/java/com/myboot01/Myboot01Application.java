package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication    //이 클래스가 스프링 부트로 만든 애플리케이션의 시작 클래스임을 의미
public class Myboot01Application { // 스프링 부트로 만든 애플리케이션을 실행하기 위해서 메인클래스를 작성, 클래스 명은 프로젝트 이름+Application.java 형태로 메인 클래스가 작성됨
	// 따라서 별도 메인 클래스를 작성하지 않고 이 프로그램만 실행하면 된다.
	//스프링 부트로 만들 애플리케이션은 일반 자바 애플리케이션으로 실행할 수도 있고 웹 애플리케이션으로 실행할 수도 있다.

	public static void main(String[] args) {
		SpringApplication.run(Myboot01Application.class, args);
	}

}
