package com.klaus.mybeanimpl;

import com.klaus.myinterface.HelloWorld;

public class HelloWorldImpl implements HelloWorld{

	public void printHelloWorld(String msg) {
		
		System.out.println("Hello : " + msg);
		
	}
	
	private String name;
	private String url;

	public void setName(String name) {
		this.name = name;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		System.out.println("Customer name : " + this.name);
	}

	public void printURL() {
		System.out.println("Customer website : " + this.url);
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

}
