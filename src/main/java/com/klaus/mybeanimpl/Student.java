package com.klaus.mybeanimpl;

import com.klaus.myinterface.HelloWorld;
import com.klaus.myinterface.Person;

public class Student implements Person {
	
	private String name;
	
	private HelloWorld hellow;
		
	public Student(String name,HelloWorld hellow){
		
		this.name=name;
		this.hellow=hellow;
		
	}
	
	
	public void study() {
		
		System.out.println(name+" will study!");
		this.hellow.printHelloWorld("nini");
		
	}

}
