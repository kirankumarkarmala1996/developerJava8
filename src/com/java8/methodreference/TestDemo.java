package com.java8.methodreference;

public class TestDemo {
	public static void main(String[] args) {
//		Arithmatic artha = (a, b) -> a*b;
//		System.out.println(artha.mul(10, 20));

			
//		if we have static method how can we map to using lambda expression to function interface
//		Arithmatic artha = Test::getMul;
//			System.out.println(artha.mul(10, 20));
		
//		if we have non static method  then hoe can we map using  lambda Expression to functional interface
		Arithmatic artha = new Test()::getAdd;
		System.out.println(artha.Add(5, 5));

		
		 
	}

}
