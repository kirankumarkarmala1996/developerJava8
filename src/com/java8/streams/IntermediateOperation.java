package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperation {
//	this are the intermediate operation
//	map,filter,disticnt,sort,limit,skip,flatmap
	public static void main(String[] args) {

List<String> liststring = Arrays.asList("ashok", "anil", "anil", "rani", "jack", "john", "ravi");
//(interview question)

//how we can print the length of the  each word present in array
//this is using lambda

//		liststring.stream().map((str)->{
//			return str.length();
//		}).forEach(System.out::println);

//using lambda

//		liststring.stream().map(String::length).forEach(System.out::println);

//using collect object

//		List<Integer>stringlength=liststring.stream().map(String::length).collect(Collectors.toList());
//		System.out.println(stringlength);

// here we are performing the stream operation at the end of the stream it Entering into terminal operation bcz of using foreach
//		liststring.stream().map((s)->s.toUpperCase()).forEach(System.out::println);
//		System.out.println("before mapping.....");
//		Stream<String>liststream = liststring.stream();
//		liststring.stream().forEach(System.out::println);
//		
//		
//		System.out.println("After mapping.....");
//		System.out.println(".....");

//this is an annomous type funtions implementing

//		Function<String, String>mapper = new Function<String, String>() {
//
//			@Override
//			public String apply(String t) {
//				return t.toUpperCase();
//			}
//		};

//using lambda how we can write this is alternate for above code

//		Function<String, String>mapper =e->e.toUpperCase();

//using method reference how we can write

//		Function<String, String>mapper =String::toUpperCase;
//
//terminal operations

//		Stream<String>listStringAftermap =liststream.map(String::toUpperCase);
//		listStringAftermap.forEach(System.out::println);

//		Stream<String> stream = liststring.stream().map(string -> {
//			return string.toUpperCase();
//		});

//Example 1= lets transfer the list of integers to square each element
//
//		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		List<Integer> squares = integerList.stream().map(i -> i * i).collect(Collectors.toList());
//		System.out.println("integer list :" + integerList);
//		System.out.println("squares :" + squares);

//		System.out.println("             ");
//		Function<Integer, Integer> function = new Function<Integer, Integer>() {
//
//			@Override
//			public Integer apply(Integer t) {
//				return t * t * t;
//			}
//
//		};

//		List<Integer> cube = integerList.stream().map(function).collect(Collectors.toList());
//		System.out.println(cube);

//here we can write in single line	

//		System.out.println("             ");
//		List<Integer> cubes = integerList.stream().map(i -> i * i * i).collect(Collectors.toList());
//		System.out.println("integer list :" + integerList);
//		System.out.println("squares :" + cubes);

//example 2:lets find the list of the string length and its string

//		List<String> stringslength = liststring.stream().map(str -> str + " -" + str.length())
//				.collect(Collectors.toList());
//		System.out.println("listofStringLength :" + stringslength);
//
////example 3:lets transfer the list of the string  into  length of each element
//		List<Integer> stringlength = liststring.stream().map(String::length).collect(Collectors.toList());
//		System.out.println(stringlength);
//
////using annoymous functions

//		Function<String, Integer> function = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String t) {
//				// TODO Auto-generated method stub
//				return t.length();
//			}
//		};
//		List<Integer> strlen = liststring.stream().map(function).collect(Collectors.toList());
//		System.out.println(strlen);
//
//		List<Integer> lambda = liststring.stream().map(str -> str.length()).collect(Collectors.toList());
////	List<String>lambda =liststring.stream().map(str->str+"-"+str.length()).collect(Collectors.toList());
//		System.out.println(lambda);
//

//// sort() based on names

//		List<String> sort = liststring.stream().sorted().collect(Collectors.toList());
//		System.out.println(sort);
//
//		System.out.println("forEach");
//		liststring.stream().sorted().forEach(System.out::println);
//
//			System.out.println();
////using lambda	here (a,b)->b.compareTo(a) we can pass our own comparator or regular expression
//			System.out.println("using lambda:with DESC");
//		liststring.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
//		System.out.println("                    ");

//		System.out.println("method referece according to some sorted order : with ASC");
//		liststring.stream().sorted(String::compareTo).forEach(System.out::println);

	}
}
