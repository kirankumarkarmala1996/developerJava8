package com.java8.stream.Interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import com.java8.stream.exercise.Student;

public class ExerciseMain {

	List<Students> studentList = StreamGetListOfEmployees.getListofStudents();

//	given List of students, you need to find  all the students whoes age is greater then 25
//	and print the student name

	public void exercise1() {
		studentList.forEach(System.out::println);

		List<String> studentsid = studentList.stream().filter(m -> m.getSid() == 25).map(e -> e.getSname())
				.collect(Collectors.toList());
		System.out.println(studentsid);
	}

// In given list of students , you need tofind all the students whoes name start with 'm' and you want to print that name
	public void exercise2() {

		List<Students> name = studentList.stream().filter(n -> n.getSname().startsWith("m"))
				.collect(Collectors.toList());
		System.out.println(name);
	}

// In give list of Students , you need  to find all the students whoes name ends with 'a' and print that name
	public void exercise3() {
		List<Students> ends = studentList.stream().filter(e -> e.getSname().endsWith("r")).collect(Collectors.toList());
		System.out.println(ends);
	}

//In given list of students ,you need find all the stidents whoes citie is hyd you want to print that student list
	public void exercise4() {

//		Optional<Students>citie=studentList.stream().filter(e->"Hyd".equal
	}

// In  a given list of Students,find the count of Students with age is greater then 25
	public void exercise5() {
//		long count=studentList.stream().filter(e->e.getAge()>25).count();
		long count = studentList.stream().filter(e -> e.getAge() == 32).count();

//		System.out.println("Count  age Greater then 25 =>"+count);
		System.out.println("Count  age equal to 32 =>" + count);

	}

// in given list of Students, find the Students whose name is jack
	public void exercise6() {
//		Optional<Students> student=studentList.stream().filter(p->"john".equalsIgnoreCase(p.getSname())).findAny();
		List<Students> student = studentList.stream().filter(p -> "john".equalsIgnoreCase(p.getSname()))
				.collect(Collectors.toList());
		System.out.println(student);

	}

//	In Given List Of Students, find the whose age is highest
	public void exercise7() {
//		Optional<Integer>optionalInt=studentList.stream().map(Students::getAge).max((a,b)->a.compareTo(b));
//		if(optionalInt.isPresent()) {
//			
//			System.out.println("max age :"+optionalInt.get());
//		}

		IntStream intStream1 = studentList.stream().mapToInt(Students::getAge);
		OptionalInt optionalint = intStream1.max();
		if (optionalint.isPresent()) {
			System.out.println("max age :" + optionalint.getAsInt());
		}

		IntStream intStream2 = studentList.stream().mapToInt(Students::getAge);
		OptionalInt optionalintmin = intStream2.min();
		if (optionalintmin.isPresent()) {
			System.out.println("min age :" + optionalintmin.getAsInt());
		}

	}

//	Given List of students , you need to sort the list of students by age ?
	public void exercise8() {
////		here default sorting based on names 
//		List<Students>sortbyage=studentList.stream().sorted().collect(Collectors.toList());

//	here default sorting based on names  but i want to sort by name
		List<Students> sortbyage = studentList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge())
				.collect(Collectors.toList());
		sortbyage.forEach(System.out::println);
	}

//	Given list of Students, you need to join  all the Students names with "," ? 

	public void exercise9() {
		List<String> studentname = studentList.stream().map(Students::getSname).collect(Collectors.toList());
		System.out.println("before string join method");
		System.out.println(studentname);
		System.out.println("after string join method");
		String studentsName = String.join(",", studentname);
		System.out.println("Students name :" + studentsName);
	}
//	Given list of Employees, you want to group them by name
	public void Exercise10() {
		Map<String, List<Students>> map=studentList.stream().collect(Collectors.groupingBy(Students::getSname));
//		Map<List<String>, List<Students>> map1=studentList.stream().collect(Collectors.groupingBy(Students::getListcites));
//		Map<Integer, List<Students>> map2=studentList.stream().collect(Collectors.groupingBy(Students::getSid));
		map.forEach((k,v)->{
			System.out.println(k+":"+v);
		});
		
	}

	public static void main(String[] args) {
		ExerciseMain exe = new ExerciseMain();
		exe.exercise1();
		System.out.println("======exercise2=======");
		exe.exercise2();
		System.out.println("======exercise3=======");
		exe.exercise3();
		System.out.println("======exercise5=======");
		exe.exercise5();
		System.out.println("======exercise6=======");
		exe.exercise6();
		System.out.println("======exercise7=======");
		exe.exercise7();
		System.out.println("======exercise8=======");
		exe.exercise8();
		System.out.println("======exercise9=======");
		exe.exercise9();
		System.out.println("======exercise10=======");
		exe.Exercise10();
		

	}

}
