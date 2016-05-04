package com.klaus.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.klaus.myinterface.HelloWorld;
import com.klaus.myinterface.Person;
import com.spring.myconfig.AppConfig; 
 

public class TestHa {

	public static void main(String[] args) {
		
		//ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//Person student=act.getBean("student",Student.class);
		
		
		 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
		 Person student = (Person) context.getBean("student");
		
		 student.study();
		
		
		// ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		    
		    obj.printHelloWorld("Spring Java Config");
		
	}
	
}
