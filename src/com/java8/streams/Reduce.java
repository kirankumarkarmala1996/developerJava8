package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
// reduce  returns the single value
		
//		this method perform reduce operation on elements of streams  
//		using initial value and binary operation
		
		
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
//
//		  System.out.println("sum : " + sum);
								//returns the single value
		int sum = Arrays.stream(numbers).reduce(0, Integer::sum);
		System.out.println(sum);// 55

		List<String> list = Arrays.asList("node", "java", "c++", "react", "javascript");

		String result1 = list.stream().reduce((first, second) -> second).orElse("no last element");
//		System.out.println(result1);

		// get last element from a list
		String result = list.get(list.size() - 1);

		// or

		// get last element from a stream, via skip
		String result2 = list.stream().skip(list.size() - 1).findFirst().orElse("no last element");
		System.out.println(result2);

	}

}
