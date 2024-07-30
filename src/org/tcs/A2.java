package org.tcs;

public class A2 {
	
	public static void main(String[] args) {
		
//Else if 
		
		int a = 10, b = 20, c = 30;
		
//          10 > 20-f   10>30-f
		if (a > b  &&   a > c) {
			System.out.println("A is Greater");	
		}
//		         20>10-t  20>20-f
		else if (b > a && b >c) {
			System.out.println("B is Greater");
		}
//		         20>10-t    20>20-f
		else if (c > a  &&  c > b) {
			System.out.println("C is Greater");
		}
		
		else {
			System.out.println("No one is Greater");
		}
	}

}
