package com.java8.Loops;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LoopAMap {
	public static void main(String[] args) {

//		Map<String, Integer> map = null;we will get null pointer exception

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put(null, 20);
		map.put("C", null);
		map.put(null, 40);
		map.put("E", 50);
		map.put("F", null);

//	      if we iterate the map we will get a set of entries 
		Set<Entry<String, Integer>> entryset = map.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		}
		System.out.println();
		System.out.println("iterate the map using the lambda");
//	      iterate the map using the lambda
		map.forEach((k, v) -> System.out.println("Key : " + k + " ,values : " + v));

		System.out.println();
		System.out.println("iterate the map using the lambda with null values");
		if (map != null) {
			map.forEach((k, v) -> {
//				here key  and value both which contains null,I don't want to print the key and values
				if (k != null&& v!=null) {
					
					System.out.println("Key : " + k + " ,values : " + v);
				}
			});

		}
		
		System.out.println("                 ");
//	map.forEach() uses the foreach(BiConsumer)  from map class
		map.forEach((k, v) -> {
			// yes, we can put logic here
			if (k != null) {
				System.out.println("Key : " + k + ", Value : " + v);
			}
		});

	}

}
