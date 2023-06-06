package com.java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpression {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(21);
		list.add(16);
		list.add(14);
		list.add(19);
		list.add(2);

//	System.out.println(list);
//	Collections.sort(list);System.out.println(list);

//	using lambda and foreach
//	list.forEach(lists->System.out.println(lists));

//	Consumer interface in java8
		System.out.println("Consumer interface in java8 it has only one  abstract  accept method ");
//		Consumer<Integer> consumer = lists -> System.out.println(lists);
//		list.forEach(consumer);
		
		Consumer<Integer>totalList=lists->System.out.println(lists);
//		this is concreat class means implementinf the interface method
//		list.forEach(new Demo());
		
//		method Reference insted of lambda expression
		list.forEach(System.out::println);

	}

}
