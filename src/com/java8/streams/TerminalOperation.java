package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TerminalOperation {
//	this are the terminal operation
//	foreach, collect, reduce,count, allmatch,nonmatch, anymatch,min, max, findany ,findfirst
	public static void main(String[] args) {

		List<String> liststring = Arrays.asList("ashok", "anil", "rani", "jack", "john", "ravi");

//		Stream<String> stream = liststring.stream().map(string -> {
//			return string.toUpperCase();
//		});

// how can we add tolist
//		List<String>myList=stream.collect(Collectors.toList());
//		System.out.println(myList);

// how can we  add toset
//		Set<String> mySet = stream.collect(Collectors.toSet());
//		System.out.println(mySet);
		

		
		
//	foreach
//		it is a terminal operation which is used to iterate over collection or streams of objects
		Stream stream2 = Stream.of("A","C","B");
		stream2.forEach(System.out::println);
		
		
//forEach Order
		
		Stream stream3 = Stream.of("B","A","C");
		stream3.forEachOrdered(System.out::println);
		
		
//before java8
//		String st = Capitalized("kiran");
//		System.out.println(st);

	}

	

//	String st = Capitalized("kiran");

	public static final String Capitalized(String str) {

		if (str == null || str.length() == 0)
			return str;
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
	
	public static final String Capitalized(String str, int startindex, int lastindex) {

		if (str == null || str.length() == 0)
			return str;
		return str.substring(startindex, lastindex).toUpperCase() + str.substring(lastindex);
	}
}
