package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	public static void main(String[] args) {
		
	////Distinct() it avoid duplicates
		List<String> liststring = Arrays.asList("ashok", "anil", "anil", "rani", "jack", "john", "ravi");
			List<String> distic = liststring.stream().distinct().collect(Collectors.toList());
			System.out.println(distic);

	}

}
