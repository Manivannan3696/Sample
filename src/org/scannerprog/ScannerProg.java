package org.scannerprog;

import java.util.Scanner;

public class ScannerProg {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Please enter your age: ");
//		
//		int age = sc.nextInt();
//		
//		if (age>=18) {
//			System.out.println("Eligible to vote");
//		}
//		else {
//			System.out.println("Not Eligible to vote");
//			
//		}
		
		System.out.println("Please enter your salary :");
		
		float salary = sc.nextFloat();
		
		if (salary<=30000.345) {
			System.out.println("Lower Salary");
		}
		else {
			System.out.println("Average salary / Higher salary");
			
		}
	}

}
