package com.klaus.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klaus.mybeanimpl.HelloWorldImpl;
import com.klaus.mybeanimpl.Student;
import com.klaus.myinterface.StudentDAO;
//import org.springframework.aop.support.RegexpMethodPointcutAdvisor;
 

public class TestHa {

	public static void main(String[] args) {

		ApplicationContext context = 
	    		new ClassPathXmlApplicationContext("applicationContext.xml");
	    	 
	        StudentDAO customerDAO = (StudentDAO ) context.getBean("StudentDAOImpl");
	        
	        Student customer = new Student();
	        customer.setName("kakaka");
	        
	        customerDAO.insert(customer);
		
	}
	
}
