package com.constructorreference;

public interface MyInterface {
//here mapping the default constructor to this method
//	Employee get();
	
	//here mapping the parameter constructor to this method	
	Employee get(int id, String name);

	
}
