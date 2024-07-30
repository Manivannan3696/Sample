package org.exceptionprog;

public class EmployeeNotFoundException extends Exception{
	
	@Override
	public String getMessage() {
		String exceptionMsg = "Invalid Employee ID";
		return exceptionMsg;
	}

}
