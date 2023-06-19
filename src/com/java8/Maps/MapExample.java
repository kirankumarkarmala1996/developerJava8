package com.java8.Maps;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	public static void main(String[] args) {
		
		List<String> words=new ArrayList<String>(Arrays.asList("hii","hello","welcome","to java","world","to become full stack developer"));
		List<String>countries = new ArrayList<String>(Arrays.asList("mumbai","honkong","UK","canada","maldives","austrialia"));
		
		
//		using map
		List<String>uppercasewords=words.stream().map(String::toUpperCase).collect(Collectors.toList());
		uppercasewords.forEach(System.out::println);
		
		
		List<String>uppercasecountries=countries.stream().map(String::toUpperCase).collect(Collectors.toList());
		uppercasecountries.forEach(System.out::println);
	}

}
