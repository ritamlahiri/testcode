package com.java8;
public class Employee {
	private String name ;
	private int id;
	private int salary;
	private int deptid;
	private String status ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Employee(String name, int id, int salary, int deptid, String status) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.deptid = deptid;
		this.status = status;
	}
	
	
	
}
