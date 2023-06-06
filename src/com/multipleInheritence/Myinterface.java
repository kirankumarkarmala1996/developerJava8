package com.multipleInheritence;

public interface Myinterface {
	
	default void myMethod() {
		System.out.println("hello Myinterface");
	}

}
