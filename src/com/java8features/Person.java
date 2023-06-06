package com.java8features;

public class Person {
	
	 String name;

//	 constructor
	public Person(String name) {
		this.name=name;
	}
	
	
	public int personInstanceMethod1(Person person) {
		return this.name.compareTo(person.name);
		
	}
	
	public int personInstanceMethod2(Person person1, Person person2) {
		return person1.name.compareTo(person2.name);
		
	}
	

}
