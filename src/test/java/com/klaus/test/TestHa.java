package com.klaus.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klaus.mybeanimpl.Student;
import com.klaus.myinterface.HelloWorld;
import com.klaus.myinterface.Person;
import com.spring.myconfig.AppConfig; 
 

public class TestHa {

	public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("applicationContext.xml");//,"springaplication.xml");
	
		Person student=act.getBean("student",Student.class);
		
		student.study();
		
	//	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
	//	 Person student = (Person) context.getBean("student");
		
	//	 student.study();
		
		
		// ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	//	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		    
	//	    obj.printHelloWorld("Spring Java Config");
		
	}
	
}
