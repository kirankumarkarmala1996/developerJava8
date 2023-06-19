package com.java8.stream.Interviews;

import java.util.List;

public class Students implements Comparable<Students> {
	private int sid;
	private String sname;
	private List<String> listcites;
	private int age;

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int sid, String sname, List<String> listcites,int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.listcites = listcites;
		this.age = age;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<String> getListcites() {
		return listcites;
	}

	public void setListcites(List<String> listcites) {
		this.listcites = listcites;
	}

	public void setAge(int Age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	

	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", listcites=" + listcites + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Students s) {
		// TODO Auto-generated method stub
		return this.getSname().compareTo(s.getSname());
	}

}
