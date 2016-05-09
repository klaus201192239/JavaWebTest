package com.klaus.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.klaus.myinterface.HelloWorld; 
//import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
 

public class TestHa {

	public static void main(String[] args) {
		
		ApplicationContext act=new ClassPathXmlApplicationContext("springaplication.xml");//,"springaplication.xml");
	
		HelloWorld cust = (HelloWorld) act.getBean("customerServiceProxy",HelloWorld.class);
	    
		cust.printHelloWorld("Spring Java Config");
		
	
		System.out.println("*************************");
		cust.printName();
		System.out.println("*************************");
		cust.printURL();
		System.out.println("*************************");
		try {
			cust.printThrowException();
		} catch (Exception e) {

		}

		
		
	//	 ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		 
	//	 Person student = (Person) context.getBean("student");
		
	//	 student.study();
		
		
		// ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	//	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		    
	//	    obj.printHelloWorld("Spring Java Config");
		
	}
	
}
