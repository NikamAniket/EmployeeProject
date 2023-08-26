package com.employee.employee;
//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
public class Employee {
	String name;
	int age;
	double salary;

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void displayEmployeeInformation() {
		System.out.println("Employee name :" + name);
		System.out.println("Employee name :" + age);
		System.out.println("Employee name :" + salary);
		System.out.println("__________________________");

	}

}
