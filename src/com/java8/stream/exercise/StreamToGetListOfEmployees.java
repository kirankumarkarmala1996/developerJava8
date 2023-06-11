package com.java8.stream.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToGetListOfEmployees {
	public static void main(String[] args) {
		List<Employee>emp = getListOfEmployees();
//		here we are getting list of employees using map before java8
//		Map<String, Integer>empmap =new HashMap<String, Integer>();
//		for (Employee employee : emp) {
//			empmap.put(employee.getName(), employee.getAge());
//		}

//		this is another way to map the list to map object
		Map<String, Integer>empmap=emp.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
		System.out.println(empmap);
//		outPut:{mahi=27, raj=55, loka=35, Gana=25}
		
		Map<Integer, List<String>>empmap1=emp.stream().collect(Collectors.toMap(Employee::getAge, Employee::getCities));
		System.out.println(empmap1);
		


		
	}
	
	public static List<Employee> getListOfEmployees() {
		
		List<Employee>listOfEmployee = new ArrayList<Employee>();
		
		
		Employee emp1 = new Employee(25, "Gana", Arrays.asList("pune","hyd"));
		Employee emp2 = new Employee(35, "loka", Arrays.asList("bang","hyd"));
		Employee emp3 = new Employee(27, "mahi", Arrays.asList("mumbai","chennai"));
		Employee emp4 = new Employee(55, "raj", Arrays.asList("maldives","delhi"));
		
		listOfEmployee.add(emp1);
		listOfEmployee.add(emp2);
		listOfEmployee.add(emp3);
		listOfEmployee.add(emp4);
		
		return listOfEmployee;
	}
	
	

}
