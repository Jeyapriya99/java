package com.basic.java;

public class Employee {
	int empId;
	String empName;
	float empSalary;

	public Employee() {
		super();

	}

	public Employee(int empId, String empName, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;

	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	public void display() {
		System.out.println("EmployeeId=" + empId);
		System.out.println("EmployeeName=" + empName);
		System.out.println("EmployeeSalary=" + empSalary);

	}

}


