package com.java8.methodreference;

import java.util.Arrays;

public class MethodReferenceToAnInstanceMethodAribitaryObject {

	public static void main(String[] args) {
		String[] stringArray = { "hii", "hello", "welcome", "java8", "features" };

		/*
		 * method reference to an instance method 
		 * of an arbitaryof an particular type
		 * 
		 * how to compare the toString class
		 */
//		this is the way to access the arbitary instance method
//		Arrays.sort(stringArray,String::compareTo);
		
		Arrays.sort(stringArray,String::compareToIgnoreCase);
		for(String str:stringArray) {
			System.out.println(str);
		}
	}

}
