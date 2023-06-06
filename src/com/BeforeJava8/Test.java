package com.BeforeJava8;

public class Test {
	public static void main(String[] args) {
		System.out.println("before java8");

//		MathOperation add = new Addition();
//		System.out.println("addition :" + add.operation(10, 20));
//		MathOperation sub = new Subtraction();
//		System.out.println("subtraction :" + sub.operation(10, 20));
//		MathOperation div = new Devision();
//		System.out.println("div :" + div.operation(10, 15));
//		MathOperation mul = new Multi();
//		System.out.println("multi :" + mul.operation(4, 5));

		System.out.println("-------");
		System.out.println("After java8");

		MathOperation additions = (a , b) -> a + b;
		MathOperation subtractions = (a, b) -> a - b;
		MathOperation divisions = (a, b) -> a / b;
		MathOperation multiplications = (a, b) -> a * b;

		int a = 5;
		int b = 12;
		
		System.out.println(additions.operation(a, b));
		System.out.println(subtractions.operation(a, b));
		System.out.println(divisions.operation(a, b));
		System.out.println(multiplications.operation(a, b));

	}

}
