package com.java8.stream.exercise;

import java.math.BigDecimal;

public class Student {
	private String name;
	private int age;
	private BigDecimal salaray;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, BigDecimal salaray, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salaray = salaray;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public BigDecimal getSalaray() {
		return salaray;
	}

	public void setSalaray(BigDecimal salaray) {
		this.salaray = salaray;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", salaray=" + salaray + "]";
	}
	
	

}
