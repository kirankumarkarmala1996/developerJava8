package com.java8.stream.Interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.java8.stream.exercise.Employee;

public class StreamGetListOfEmployees {
	
	public static void main(String[] args) {
//		Map<String,Integer>emp=
	}
	
	
	public static List<Students>  getListofStudents() {
		List<Students> studentList = new ArrayList<>();
		
		Students stu = new Students(25,"jack",Arrays.asList("hyd","bang"),25);
		Students stu1 = new Students(26,"john",Arrays.asList("chennai","bang"),32);
		Students stu2 = new Students(27,"harry",Arrays.asList("mumbai","bang"),45);
		Students stu3 = new Students(28,"potter",Arrays.asList("hyd","kolkatta"),50);
		Students stu4 = new Students(29,"anu",Arrays.asList("puni","bang"),25);
		Students stu5 = new Students(30,"mani",Arrays.asList("nelloor","bang"),37);
		Students stu6 = new Students(31,"mack",Arrays.asList("vij","bang"),32);
		
		studentList.add(stu);
		studentList.add(stu1);
		studentList.add(stu2);
		studentList.add(stu3);
		studentList.add(stu4);
		studentList.add(stu5);
		studentList.add(stu6);
		
		return studentList;
		
	}
	
	
	
	

}
