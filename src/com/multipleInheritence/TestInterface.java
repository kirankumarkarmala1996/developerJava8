package com.multipleInheritence;

public class TestInterface implements Myinterface,Myinterface2 {

	
	public  void myNewMethod() {
//		calling the super interfaces methods
		Myinterface.super.myMethod();
		Myinterface2.super.myNewMethod();
		System.out.println("hello TestInterface ");
	}
	
	public static void main(String[] args) {
		TestInterface test = new TestInterface();
		test.myNewMethod();
	}

	
	
	

}
