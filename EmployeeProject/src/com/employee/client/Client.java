package com.employee.client;

import com.employee.employee.Employee;
import com.employee.makeemployee.MakeEmployee;

public class Client {

	public static void main(String[] args) {
		Employee obj1 = MakeEmployee.makeE1();
		Employee obj2 = MakeEmployee.makeE2();
		obj1.displayEmployeeInformation();
		obj2.displayEmployeeInformation();

	}

}
