package com.constructorreference;

public class Test {
	public static void main(String[] args) {

////		
//		MyInterface myinterface = new MyInterfaceImpl();
//		myinterface.get();
//
////	use to create 	Annomous inner type 
//		MyInterface myinterface1 = new MyInterface() {
//
//			@Override
//			public Employee get() {
//				Employee emp = new Employee();
//				return emp;
//			}
//		};
//		myinterface1.get();
//
////		using lambda creating object
//		MyInterface myinterface2 = () -> new Employee();
//		myinterface2.get();
//	
////		constructor reference
//		MyInterface myinterface3 = Employee::new;
//		myinterface3.get();
		
		MyInterface myinterface4 =Employee::new;
		myinterface4.get(10,"kiran");

	}

}
