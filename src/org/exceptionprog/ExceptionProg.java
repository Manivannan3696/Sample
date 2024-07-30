package org.exceptionprog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionProg {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//arithmetic exception
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4/0);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		
//		// null point exception 
//		String s1 = null;
//		char charAt = s1.charAt(2);
//		System.out.println(charAt);
//		
//		//string index out of bound exception
//		String s2 = "java";
//		char charAt2 = s2.charAt(6);
//		System.out.println(charAt2);
//		
//		//array index out of bond
//		int[] a = new int [4];
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		a[3] = 4;
//		System.out.println(a[5]);
		
//		// index out of bond exception
//		List<Integer> li1 = new ArrayList<Integer>();
//		li1.add(10);
//		li1.add(20);
//		li1.add(30);
//		li1.add(10);
//		li1.add(40);
//		System.out.println(li1.get(8));
		
//		//input mismatch exception
//		//to get a input from user
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please enter your age :");
//		
//		int age = sc.nextInt();
//		System.out.println("Age is : "+age);
//		
//		if (age>=18) {	
//			System.out.println("Eligible to vote");	
//		}
//		else {
//			System.out.println("Not eligible to vote");
//		}
//		
//		//number format exception 
//		String s1 = "123454";
//		// to convert string input to integer
//		// parseInt() -> Integer: C
//		int parseInt1 = Integer.parseInt(s1);
//		System.out.println(parseInt1);
//		
//		String s2 = "6789java";
//		int parseInt2 = Integer.parseInt(s2);
//		System.out.println(parseInt2);
		
		
		
//		// to handle file related activity
//		File file = new File("");
//		
//		FileInputStream inputStream = new FileInputStream(file);
//		
		
		
		
		
		
		
		
		
		
		
	}

}
