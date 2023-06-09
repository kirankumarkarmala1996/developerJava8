package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.swing.text.html.InlineView;

public class LimitAndskip {
	public static void main(String[] args) {
		List<Integer> integerlist = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//insted of ten records i have to print only 5 records
//		integerlist.stream().limit(5).forEach(System.out::println);

//insted of ten records i have to skip  5 records and then remaining i want to print
//		integerlist.stream().skip(5).forEach(System.out::println);

//		to find out the min optional is to avoid the null pointer exception
		Optional<Integer> optional = integerlist.stream().min(Integer::compareTo);
//		System.out.println("min value : " + optional.get());

//To find out the max value
		Optional<Integer> optional1 = integerlist.stream().max(Integer::compareTo);
//		System.out.println("max value : " + optional1.get());

// to find out the count
		long num = integerlist.stream().count();
//		System.out.println(num);
		
		
//FindAny
		Optional<Integer> option=integerlist.stream().findAny();
		System.out.println("get any number : "+option.get());

		
		Optional<Integer> optio=integerlist.stream().findFirst();
		System.out.println("get any number : "+optio.get());
	}

}
