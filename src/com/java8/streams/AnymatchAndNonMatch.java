package com.java8.streams;

import java.util.stream.Stream;

public class AnymatchAndNonMatch {
	public static void main(String[] args) {
		
		Stream<String>stream = Stream.of("a","b","c","d","z");
//		it returns true  there is an 'a' element present in the stream
//		Boolean a=stream.anyMatch("a"::equals);//true
//		System.out.println("Is present"+a);
		
		
//		it returns false bcz there is no element in the stream
//		Boolean f=stream.anyMatch("f"::equals);//false
//		System.out.println( "IS Not Present f : "+f);
		
//		Non-Match(it returns true bcz there no  element match to z)true
//		Non-Match(it returns false bcz there is  element match to z)false
		Boolean z=stream.noneMatch("z"::equals);//true
		System.out.println(z);
		
		
		
	}

}
