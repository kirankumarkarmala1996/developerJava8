package com.java8.Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Flattringmap {
	public static void main(String[] args) {
		
		List<String> words=new ArrayList<String>(Arrays.asList("hii","hello","welcome","to java","world","to become full stack developer"));
		List<String>countries = new ArrayList<String>(Arrays.asList("mumbai","honkong","UK","canada","maldives","austrialia"));
		
		
//Example1: I want to merge the two words, countries using flattering map
		
//		first we want to convert two list to into single array list
		List<List<String>>mergelist=Arrays.asList(words,countries);
		List<String>mergeData=mergelist.stream().flatMap(e->e.stream()).map(String::toUpperCase).collect(Collectors.toList());
		
		mergeData.forEach(System.out::println);
		
		
		
		
		
	}

}
