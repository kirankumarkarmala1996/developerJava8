package com.AnnonamusInnerClass;

import com.java8features.PrintStreamDemo;

public class TestDemo {
//	this is the implementation of anonymous inner class
	public static void main(String[] args) {
//		Test test = new Test() {
//			
//			@Override
//			public void accept(String name) {
//				
//				System.out.println(name);
//			}
//		};
		// using Lambda expression
//		Test test=tests->System.out.println(tests);
//		test.accept("Kirankumar");
		
		
//		Using method reference
		Test test=PrintStreamDemo::print;	
		test.accept("kirankumar");
	}

}
