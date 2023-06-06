package com.BeforeJava8;

public class Addition  implements MathOperation{

	@Override
	public int operation(int a, int b) {
		return a+b;
	}

}
