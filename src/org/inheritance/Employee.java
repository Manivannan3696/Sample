package org.inheritance;
// child class LHS             RHS parent class B
public class Employee  extends Company {
	
	private void empName() {
		
		System.out.println("Employee name : Mani");

	}
	
	private void empMobile() {
		
		System.out.println("Employee mobile : 8636283947");
	}
	
	private void empId() {
		
		System.out.println("Employee id : 1211");
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		e.empName();
		e.empMobile();
		e.empId();
		
		e.comId();
		e.comName();
		e.clName();
		e.clLocation();
		
		
	}

}
