package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filters {
	public static void main(String[] args) {
//Filter()	

		List<String> liststring = Arrays.asList("ashok", "anil", "anil", "rani", "jack", "john", "ravi");
		 liststring.stream().filter(s->s.contains("a")).forEach(System.out::println);

//		liststring.stream().filter(s->s.lastIndexOf(str).forEach(System.out::println);
		 
//		 aribitary objects
//		  passing type of parameter and comparing type of obj both are same means is call aribatary objects
		
		 
//Example 1: i would like to print only even numbers
			
			List<Integer>integerlist =Arrays.asList(1,2,3,4,5,6,7,8,9,10); 
//	even numbers		
			integerlist.stream().filter(n->n%2==0).forEach(System.out::println);
			
//Odd numbers
			integerlist.stream().filter(n->n%2!=0).forEach(System.out::println);
			

		 
		 

	
}

}
