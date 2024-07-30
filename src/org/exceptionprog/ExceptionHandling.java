package org.exceptionprog;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		//exception handling
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		
		//to handle the exception
		//try,catch blocks
		try {  // exception contains coding lines
			System.out.println(4/2);	
			
			String s1 = "java";
			char charAt = s1.charAt(2);
			System.out.println(charAt);
			
			String s2 = null;
			char charAt1 = s2.charAt(2);
			System.out.println(charAt1);
		}
		
		catch (ArithmeticException e) {  //solution for the exception	
		    System.out.println("don't try to divide a number by zero");
		}
//		catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Don't try to fetch beyond string limit");
//		}
//		catch (NullPointerException e) {
//			System.out.println("Don't try to fetch from null");
//		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception Handled");
		}
		finally {
			// to close  multiple window
			//to close the database
			//to write with opened file (need to close)
			System.out.println("Code always execute : finally block");
		}
		
		
		System.out.println(5);
		System.out.println(6);
		System.out.println("program completed");
			
	}

}
