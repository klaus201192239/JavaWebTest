package com.spring.myconfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({ AppConfigHello.class, AppConfigPerson.class})
public class AppConfig {

	
	
	
	
}
