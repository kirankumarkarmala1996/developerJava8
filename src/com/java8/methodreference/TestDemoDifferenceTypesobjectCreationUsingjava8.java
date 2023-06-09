package com.java8.methodreference;

public class TestDemoDifferenceTypesobjectCreationUsingjava8 {
	public static void main(String[] args) {
//		Arithmatic artha = (a, b) -> a*b;
//		System.out.println(artha.mul(10, 20));

//if we have static method how can we map to using method reference to function interface
//		Arithmatic artha = Test::getMul;
//			System.out.println(artha.mul(10, 20));

//if we have non static method  then hoe can we map using  method reference to functional interface
//		Arithmatic artha = new Test()::getAdd;
//		System.out.println(artha.Add(5, 5));

//how we call if method does'nt have parameter using lambda expression
//		GetHello gethello = () -> new Hello();
//		System.out.println(gethello.Get());
		
//		how can we provide the implementation for the iproduct interface method which is created object to the product class
//		Iproduct iproduct = (product)->{
//		System.out.println(product.toString());
//		};
////		this is the implementation for the interface method
//		iproduct.toString(new Product());
		
//	if  we want to map the product class object to the interface method then we want to pass the product as parameter in interface method	
		Iproduct iproduct =  Product::toStr;
		System.out.println(new Product());
		
	}

}
