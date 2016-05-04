package com.klaus.mybeanimpl;

import com.klaus.myinterface.Person;

public class Student implements Person {
	
	private String name;
	
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void study() {
		
		System.out.println(" will study!");
		
	}

}
