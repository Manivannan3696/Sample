package org.polymorphism;

public class EmployeeDetails {
	
	// normal method or empty args method
	private void employee() {
		System.out.println("Employee details as follows:");
	}
	
	// args based on data type
	private void employee(int empId) {
		System.out.println("Employee id : "+empId);
		
	}
	
	private void employee(String  empName) {
		System.out.println("Employee name : "+empName);
		
	}
	
	// args based on data type count
	private void employee(int empId, float empSalary, long empMobile) {
		System.out.println("Employee id : "+empId);
		System.out.println("Employee salary : "+empSalary);
		System.out.println("Employee mobile : "+empMobile);
		
	}
	
	// args based on data type order
	private void employee(float empSalary,int empId, long empMobile) {
		
		
		System.out.println("Employee id : "+empId);
		System.out.println("Employee mobile : "+empMobile);
		System.out.println("Employee salary : "+empSalary);
		
			
		}
		
		
	public static void main(String[] args) {
		
		EmployeeDetails a = new EmployeeDetails();
		a.employee();
		a.employee(111);
		a.employee("Mani");
		a.employee(111, 34897.776f, 8344720398l);
		a.employee(34897.776f, 111, 8344720398l);
		
		// we can use the methods as a reusable one
		
		EmployeeDetails b = new EmployeeDetails();
		b.employee();
		b.employee(123);
		b.employee("Siva");
		b.employee(123, 30895.776f, 8344725643l);
		b.employee(30895.776f, 123, 8344725643l);
		
		
	
	}
	
	
	
	

}
