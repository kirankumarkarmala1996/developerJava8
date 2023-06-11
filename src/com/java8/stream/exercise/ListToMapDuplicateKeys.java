package com.java8.stream.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapDuplicateKeys {
	public static void main(String[] args) {
		
		List<Employee>list = new ArrayList<Employee>();
		list.add(new Employee(12,"hope",Arrays.asList("chennai","hyd")));
		list.add(new Employee(18,"doing",Arrays.asList("bang","hyd")));
		list.add(new Employee(3, "digitalocean.com",Arrays.asList( "bang","london")));
		list.add(new Employee(3, "digitalocean.com",Arrays.asList( "bang","london")));
        list.add(new Employee(4, "aws.amazon.com", Arrays.asList("bangcock","cheina")));
        
//        Map<String, List<String>>emplistmap=list.stream().collect(Collectors.toMap(Employee::getName, Employee::getCities));
//        System.out.println(emplistmap);//java.lang.IllegalStateException: Duplicate key digitalocean.com
		
        
//        To solve the duplicated key issue above, pass in the third mergeFunction argument like this :
        
        Map<String, List<String>> result1 = list.stream().collect(
                Collectors.toMap(Employee::getName, Employee::getCities,
                        (oldValue, newValue) -> oldValue
                )
        );
        System.out.println(result1);
	}

}
