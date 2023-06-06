package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

}

class LambdaExpressionForComparator {
	public static void main(String[] args) {
		
		List<Product>productList= new ArrayList<Product>();
//		adding the products to the list
		productList.add(new Product(10, "hello", 15000));
		productList.add(new Product(20, "hii", 12000));
		productList.add(new Product(13, "java is very easy", 100000));
		
//		implementing the lambda expression
		Collections.sort(productList,(A1,A2)->{
			return A1.name.compareTo(A2.name);
		});
		for(Product pro:productList) {
			System.out.println("id "+pro.id+"product name :"+pro.name+"product price :"+pro.price);
		}

	}

}
