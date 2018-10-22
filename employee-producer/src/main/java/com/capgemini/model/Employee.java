package com.capgemini.model;



public class Employee {
	
	
	private String empId;
	private String designation;
	private String name;
	private int salary;
	public Employee(String empId, String designation, String name, int salary) {
		super();
		this.empId = empId;
		this.designation = designation;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", designation=" + designation
				+ ", name=" + name + ", salary=" + salary + "]";
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}

