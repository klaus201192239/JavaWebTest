package com.spring.myconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.klaus.mybeanimpl.HelloWorldImpl;
import com.klaus.myinterface.HelloWorld;

@Configuration
public class AppConfigHello {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
   }
	

}
