package org.employee;

import org.client.Client;

public class EmployeeDetails {
	
	private void empName() {
		System.out.println("Employee name : Mani");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile number : 8433720398");
	}
	
	public static void main(String[] args) {
		
		Client cl = new Client();
		cl.clName();
		cl.clLocation();

		
		EmployeeDetails e = new EmployeeDetails();
		e.empName();
		e.empMobile();
		
		// same package access
		
		Company c = new Company();
		c.comName();
		c.comId();
		
		
	}

}
