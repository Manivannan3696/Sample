package org.exceptionprog;

public class UseClass {
	
	public static void main(String[] args) throws EmployeeNotFoundException {
		
		String empId = "2001";
		
		if (empId.startsWith("100")) {
			System.out.println("Valid Employee");
			
		}
		else {
			
			throw new EmployeeNotFoundException();
		}
		try {
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
