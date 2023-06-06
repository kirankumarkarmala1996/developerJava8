package com.java8features;

public class SayableTester {
	public static void main(String[] args) {
		Sayable sayable =(msg)->System.out.println(msg);
		sayable.say("kiran");
	}

}
