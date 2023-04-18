package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
//@SpringBootConfiguration
//@EnableAutoConfiguration

//@ComponentScan : 기본적으로 main()메소드가 포함된 Myboot01Application 클래스가 속해있는 패키지(com.myboot01)을 베이스 패키지로 하여 빈 등록을 처리
//즉 루트 패키지(com.myboot01)가 아닌 다른 패키지에 클래스를 작성하면 스프링 컨테이너는 해당 클래스를 빈으로 등록하지 않게 된다. 
//@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })

@SpringBootApplication // 이 클래스가 스프링 부트로 만든 애플리케이션의 시작 클래스임을 의미
@ComponentScan(basePackages = { "com.myboot01", "com.ruby" }) //다른 패키지에 있는 클래스까지 등록하기 위한 어노테이션
public class Myboot01Application { // 스프링 부트로 만든 애플리케이션을 실행하기 위해서 메인클래스를 작성, 클래스 명은 프로젝트 이름+Application.java 형태로 메인 클래스가 작성됨
	// 따라서 별도 메인 클래스를 작성하지 않고 이 프로그램만 실행하면 된다.
	// 스프링 부트로 만들 애플리케이션은 일반 자바 애플리케이션으로 실행할 수도 있고 웹 애플리케이션으로 실행할 수도 있다.

	public static void main(String[] args) {
		SpringApplication.run(Myboot01Application.class, args);
	}

}
