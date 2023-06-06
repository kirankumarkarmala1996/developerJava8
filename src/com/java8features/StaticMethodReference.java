package com.java8features;

public class StaticMethodReference {
	
	public static void main(String[] args) {
//		static method reference
		Sayable sayable= SaySometing::listenigSomething;
		sayable.say("this is java class");
	}

}
