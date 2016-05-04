package com.klaus.mybeanimpl;

import com.klaus.myinterface.HelloWorld;

public class HelloWorldImpl implements HelloWorld {

	public void printHelloWorld(String msg) {
		
		System.out.println("Hello : " + msg);
		
	}

}
