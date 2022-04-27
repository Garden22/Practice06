package com.javaex.ex05;

public class Depart extends Employee {

	protected String department;
	 
	public Depart() {
		 super();
	}
	 
	public Depart(String name, int salary, String department) {
		 super(name, salary);	 
		 this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void showInformation() {
		System.out.println("이름:" + this.getName() + " 연봉:" + this.getSalary() + " 부서:" + department);
	}
	 
}
