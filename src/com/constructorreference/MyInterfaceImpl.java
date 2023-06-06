package com.constructorreference;

public class MyInterfaceImpl implements MyInterface {

//	@Override
//	public Employee get() {
//		Employee emp = new Employee();
//		return emp;
//	}

	
	@Override
	public Employee get(int id, String name) {
		Employee emp1 = new Employee(id,name);
		return emp1;
	
	}

}
