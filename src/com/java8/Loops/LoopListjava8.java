package com.java8.Loops;

import java.util.ArrayList;
import java.util.List;

public class LoopListjava8 {
	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<>();
	      list.add("A");
	      list.add("B");
	      list.add("C");
	      list.add("D");
	      list.add("E");

	      // lambda 
//	      list.forEach() uses the foreach(consumer)  from iterable class
	       list.forEach(x -> System.out.println(x));

	      // method reference
	      list.forEach(System.out::println);
	      
//	      difference between consumer and bycosumer
	      
//	      consumer 
//	      ----------
//	      consumer is a functional interface and it has 
//	      only one  abstract  method that is accept method 
//	      it has only one input value.
//	      ex:void accept(T t);
	      
//	      note: if we want to iterate the list then we want to use consumer impl
	      
//	      ByConsumer
//	      ----------
//	      ByConsumer is a functional interface and it has 
//	      only one  abstract  method that is accept method 
//	      it has only two input value.
//	      ex:void accept(T t, U u);
	      
//	      note: if we want to iterate the map then we want to use ByConsumer impl
	}
	

}
