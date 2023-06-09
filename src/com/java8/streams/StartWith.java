package com.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StartWith {
public static void main(String[] args) {
	
//startwith()

	List<String> liststring = Arrays.asList("ashok", "anil", "anil", "rani", "jack", "john", "ravi");
	liststring.stream().filter(s -> s.startsWith("r")).forEach(System.out::println);
	

}
}
