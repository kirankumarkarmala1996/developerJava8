package com.java8.stream.exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

	Comparator<Student> comp = new Comparator<Student>() {
//annomous obj

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};

//	using lambda
	Comparator<Student> empl = (Student o1, Student o2) -> o1.getName().compareTo(o2.getName());

	private static List<Student> getDevelopers() {

		List<Student> result = new ArrayList<Student>();

		result.add(new Student("mkyong", new BigDecimal("70000"), 33));
		result.add(new Student("alvin", new BigDecimal("80000"), 20));
		result.add(new Student("jason", new BigDecimal("100000"), 10));
		result.add(new Student("iris", new BigDecimal("170000"), 55));

		return result;
	}

	public static void main(String[] args) {
//		sort with out lambda
		List<Student> listStu = getDevelopers();

		System.out.println("before sorting");
		for (Student stu : listStu) {
			System.out.println(stu);
		}

		System.out.println("sort by age");
		Collections.sort(listStu, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});

		System.out.println("sort by name");

		Collections.sort(listStu,new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("sort by salary");
		Collections.sort(listStu, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getName().compareTo(o1.getName());
			}

		});
		System.out.println();

		System.out.println("after sorting");
		for (Student stude : listStu) {
			System.out.println(stude);

		}
	}

}
