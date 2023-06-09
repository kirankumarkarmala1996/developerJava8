package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMap {
	public static void main(String[] args) {
// before java8		
		List<Integer> intlist = Arrays.asList(22, 55, 44, 88, 71, 4, 32, 69, 81);
//		int min=intlist.get(0);
//		for(Integer num:intlist) {
//			if(min>num) {
//			min=num;
//		}
//		}
//		System.out.println("minimum num :"+min);

//optional which is used to avoid the null pointer exception

		Optional<Integer> optional = intlist.stream().min(Integer::compareTo);
		System.out.println("min value : " + optional.get());

	}

}
