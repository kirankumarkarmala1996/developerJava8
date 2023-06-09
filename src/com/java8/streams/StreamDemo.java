package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
//		List<String>list =Arrays.asList(new String[] {"chatra","pathi","Shivaji"});
//		String []arr=new String[] {"chatra","pathi","Shivaji"};
//		List<String>list=Arrays.asList(arr);
//		System.out.println(list);
//		
////		how to create a stream
//		Stream<String>stream = list.stream();
//		System.out.println(stream);// stream object will print stream object contains foreach 
//		System.out.println("           ");
//		System.out.println("after creating the streams........");
//		stream.forEach(System.out::println);
//		
//How to create a empty stream
//		
//		Stream stream1 = Stream.empty();
//		System.out.println(stream1);//it returns stream object
//		System.out.println("           ");
//
//create a stream of using this we can pass the list of object
//		Stream stream2 = Stream.of(arr);
		
		
		
//or else we can pass the directly array elements
		
//		Stream stream2 = Stream.of("hello","hii","kiran");
//		stream2.forEach(System.out::println);

		
		
//creating limited randam numbers

//		Supplier supplier = () -> Math.random();
//		Stream stream = Stream.generate(supplier).limit(10);
//		stream.forEach(System.out::println);

//		Supplier supplier =new Supplier() {
//
//			@Override
//			public Object get() {
//				return 1;
//			}
//		};
//		or else
//		Stream stream = Stream.generate(()->2).limit(5);
//		stream.forEach(System.out::println);

//or else we can directly pass math.randam
//		Stream stream = Stream.generate(()->Math.random()).limit(5);
//		stream.forEach(System.out::println);

//if i want to print numbers using streams
		Stream stream = Stream.iterate(1, n -> n + 1).limit(100);
		stream.forEach(System.out::println);

	}

}
