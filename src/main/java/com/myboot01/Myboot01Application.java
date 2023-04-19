package com.myboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
//@SpringBootConfiguration



//이 메인 클래스를 실행하면 내장 톰캣이 구동되고 스프링 기반의 웹 애플리케이션이 잘 동작함, 하지만 간단한 웹이라도 여러가지 설정이 필요함, 그럼에도 쉽게 가능하도록 하는 것이 스프링 부트 어플리케이션.
//@EnableAutoConfiguration  //스프링 부트는 라이브러리 관리도 어렵고, 설정도 복잡하므로 초보 개발자들은 어려워한다. 그래서 스프링 부트는 이런 복잡한 설정을 자동으로 처리해준다.

//@ComponentScan : 기본적으로 main()메소드가 포함된 Myboot01Application 클래스가 속해있는 패키지(com.myboot01)을 베이스 패키지로 하여 빈 등록을 처리
// 설정된 패키지 경로에 포함된 자바 설정 클래스들과 스테레오 타입 에너테이션들이 선언된 클래스들(@component, @controller, @service, @repository)을 스캔
//즉 루트 패키지(com.myboot01)가 아닌 다른 패키지에 클래스를 작성하면 스프링 컨테이너는 해당 클래스를 빈으로 등록하지 않게 된다. 
//@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })


//*@Configuration 에너테이션은 자바 설정을 포함하고 있는 자바 설정 클래스를 정의하는데 사용한다. (@Component-scan과 항상 같이 쓴다)
// 스프링 프레임 워크는 여러 자바 설정 클래스를 스캔하는 @ComponentScan과 자바 설정 클래스를 임포트하는 @Import 에너테이션(명시된 여러개의 자바 설정 클래스를 하나의 그룹으로 묶는 역할, 사용할 일은 별로 없음) 제공
// @Configuration                    //다른 일반 클래스와 구분이 됨, 애너테이션으로 설정된 클래스들을 메타 정보로 간주하고 로딩한다
// public class ThreadPoolConfig{    // 자바 설정 클래스의 내부의 @Bean으로 선언된 메서드들을 포함할 수 있고, 이를 로딩한 스프링 빈 컨테이너에 의해 스프링 빈으로 생성된다. 
//     @Bean                         // @Configuration이 없으면 ApplicationContext가 로딩되지 않음, 그러므로 @Bean으로 선언된 threadPoolTaskExechtor() 스프링 빈 설정은 스프링 빈이 될 수 없다. 
//     public ThreadPoolTaskExecutor threadPoolTaskExechtor(){
//            
//}
// } 

//@EnableAutoConfiguration  //자동 설정과 관련된 어노테이션, 스프링 부트는 두 단계로 나누어 객체들을 초기화함, 왜냐하면 두 종류의 빈이 필요하므로, BoardController에서 MultipartFile 객체를 이용해서 업로드 가능한 컨트롤러로 구현해야 한다. 
//실제로 파일 업로드 기능이 동작하기 위해서는 반드시 사용자가 업로드한 파일 정보가  MultipartFile객체에 설정되어 있어야 함. 이를 위해서 멀티파트 리졸버 객체가 반드시 필요, 두 개의 객체 생성과정이 필요, 결국 @ComponentScan은 내가 만든 컨트롤러 객체를 메모리에 올리는 작업을 처리하고, @EnableAutoConfiguration은 CommonMultipartResolver와 같은 객체들을 메모리에 올리는 작업 처리 
//@SpringBootConfiguration //기존에 환경설정 빈 클래스를 표현하기 위해 사용한 @Configuration과 동일하다.
@SpringBootApplication // 이 클래스가 스프링 부트로 만든 애플리케이션의 시작 클래스임을 의미
@ComponentScan(basePackages = { "com.myboot01", "com.ruby" }) //다른 패키지에 있는 클래스까지 등록하기 위한 어노테이션
public class Myboot01Application { // 스프링 부트로 만든 애플리케이션을 실행하기 위해서 메인클래스를 작성, 클래스 명은 프로젝트 이름+Application.java 형태로 메인 클래스가 작성됨
	// 따라서 별도 메인 클래스를 작성하지 않고 이 프로그램만 실행하면 된다.
	// 스프링 부트로 만들 애플리케이션은 일반 자바 애플리케이션으로 실행할 수도 있고 웹 애플리케이션으로 실행할 수도 있다.

	public static void main(String[] args) {
		SpringApplication.run(Myboot01Application.class, args);
	}

}
