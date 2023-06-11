package com.java8.stream.exercise;

import java.util.List;

public class Employee  implements Comparable<Employee>{
	private int age;
	private String name;
	private List<String> cities;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int age, String name, List<String> cities) {
		super();
		this.age = age;
		this.name = name;
		this.cities = cities;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", cities=" + cities + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}

}
