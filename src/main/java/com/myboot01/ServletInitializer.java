package com.myboot01;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {  // SpringBootServletInitializer의 역할은 스프링 부트 애플리케이션을 web.xml 없이 톰캣에서 실행하게 해주는 것
	                                    //An opinionated WebApplicationInitializer to run a SpringApplicationfrom a traditional WAR deployment.

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Myboot01Application.class);
	}

}
