package com.klaus.mybeanimpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.klaus.myinterface.HelloWorld;
import com.klaus.myinterface.Person;

public class Student implements Person {
	
	private String name;
	
	private HelloWorld hellow;
	
	
	private List<Object> lists;
	private Set<Object> sets;
	private Map<Object, Object> maps;
		
	//public Student(String name,HelloWorld hellow){
		
	//	this.name=name;
	//	this.hellow=hellow;
		
//	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public HelloWorld getHellow() {
		return hellow;
	}



	public void setHellow(HelloWorld hellow) {
		this.hellow = hellow;
	}



	public List<Object> getLists() {
		return lists;
	}



	public void setLists(List<Object> lists) {
		this.lists = lists;
	}



	public Set<Object> getSets() {
		return sets;
	}



	public void setSets(Set<Object> sets) {
		this.sets = sets;
	}



	public Map<Object, Object> getMaps() {
		return maps;
	}



	public void setMaps(Map<Object, Object> maps) {
		this.maps = maps;
	}



	public void study() {
		
		System.out.println(name+" will study!");
		this.hellow.printHelloWorld("nini");
		
		for(int i=0;i<lists.size();i++){
			if(i==0){
				System.out.println(lists.get(i).toString());
			}else{
				HelloWorld hh=(HelloWorld)lists.get(i);
				hh.printHelloWorld("cfds");
			}
		}
		
		HelloWorld hh=(HelloWorld)maps.get("key2");
		hh.printHelloWorld("lalal");
		
		
		
	}

}
