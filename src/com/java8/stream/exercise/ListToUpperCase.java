package com.java8.stream.exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToUpperCase extends ComparatorExample  {
	
	public static void main(String[] args) {
		List<String>listtoUpper =Arrays.asList("a","b","c","d");
		for(String uppercase:listtoUpper) {
//			System.out.println(uppercase.toUpperCase());
		}
		
		
//	using method reference  and map
		
		List<String>uppercases=listtoUpper.stream().map(String::toUpperCase).collect(Collectors.toList());
//		System.out.println(uppercases);

//		foreach
//		listtoUpper.stream().map(String::toUpperCase).forEach(System.out::println);

//		how to get  only list of names
		
		
		List<Student>result=new ArrayList<Student>();
		result.add(new Student("mkyong", new BigDecimal("70000"), 33));
		result.add(new Student("alvin", new BigDecimal("80000"), 20));
		result.add(new Student("jason", new BigDecimal("100000"), 10));
		result.add(new Student("iris", new BigDecimal("170000"), 55));

		System.out.println();
		
		result.stream().map(stu->stu.getName().toUpperCase()).forEach(System.out::println);
		
	}

}
