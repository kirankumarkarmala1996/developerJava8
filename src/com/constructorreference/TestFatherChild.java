package com.constructorreference;

public class TestFatherChild {
	public static void main(String[] args) {
		
//		creating the object using constructor  with method reference 
		
		Father father= Child:: new;
		father.come();
		
	}

}
