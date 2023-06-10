package com.java8.Loops;

import java.util.stream.Stream;

public class ForEachandForEachOrder {
	public static void main(String[] args) {
		
//		first you want to differ between stream and parallel stream
		
		Stream<String>stream =Stream.of("a","b","c","d","e","f");
		
		//foreach comming from the stream class
//		stream.forEach(System.out::println);//normally it will iterate
		
//		parallel stream = it will divided the object and execute parallel
//		stream.parallel().forEach(System.out::println); 
		
//		here i want execute the parallel but I'want to follow some 
//		insertion order then use the foreachorder
		stream.parallel().forEachOrdered(System.out::println);
	}

}
