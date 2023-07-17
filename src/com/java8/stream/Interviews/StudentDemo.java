package com.java8.stream.Interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StudentDemo {

	public static void main(String[] args) {
		List<String> number = Arrays.asList("12", "25", "34");
		// converting String to int
//		number.stream().mapToInt(e->Integer.parseInt(e));
		IntStream intstream = number.stream().mapToInt(Integer::parseInt);

//	here if i want to print more then 20 elements
		intstream.filter(p -> p > 20).forEach(System.out::println);
	}

}
