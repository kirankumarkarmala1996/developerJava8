package com.java8.stream.Interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java8.stream.exercise.Student;

public class GroupByEmployee {
	public static void main(String[] args) {
		List<Employee>employees = new ArrayList<Employee>();
		employees.add(new Employee(1,"kiran","EEE"));
		employees.add(new Employee(2,"mahesh j","ece"));
		employees.add(new Employee(3,"pothan j","IT"));
		employees.add(new Employee(4,"mahesh k","bba"));
		employees.add(new Employee(5,"pawan g","EEE"));
		employees.add(new Employee(6,"anil g","CSE"));
		employees.add(new Employee(7,"ram k","ECE"));
		employees.add(new Employee(8,"gopi k","IT"));
		employees.add(new Employee(9,"vishnu","EEE"));
		
		Map<String, List<Employee>>map = new HashMap<String, List<Employee>>();
		for(Employee empl :employees) {
			if(!map.containsKey(empl.getDept())) {
				List<Employee>emp = new ArrayList<Employee>();
				emp.add(empl);
				map.put(empl.getDept(), emp);
			}else {
				List<Employee>empList=map.get(empl.getDept());
				empList.add(empl);
				map.put(empl.getDept(), empList);				
		}
		}
		map.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}
	
	

}
