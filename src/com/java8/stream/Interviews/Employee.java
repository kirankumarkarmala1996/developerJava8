package com.java8.stream.Interviews;

import java.util.List;

public class Employee implements Comparable<Employee> {
	private int eid;
	private String eName;
	private String dept;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eid, String eName, String dept) {
		super();
		this.eid = eid;
		this.eName = eName;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", dept=" + dept + "]";
	}

	@Override
	public int compareTo(Employee o) {
		return this.eName.compareTo(o.eName);
	}

}
