package com.java8features;

import java.util.function.Consumer;

public class Demo implements Consumer<Integer>{

	@Override
	public void accept(Integer t) {
		System.out.println(t);
		
	}
	

}
