package org.arrayprog;

public class Arrayprog {
	
	public static void main(String[] args) {
		
		//datatype[] variablename = new datatype[length];
		int[] a = new int[5];
		// int[] a = new int[9];
		//01234
		//i
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
//		//beyond the array length
//		a[5]=60;
//		
//		System.out.println(a[4]);
		
		// for loop / index /  normal - index based
		
		for (int i = 1; i < 4; i++) {
			System.out.println(a[i]);
			
		}
		
		System.out.println("******************");
		
		//enhanced for loop --> value based
		for (int data : a) {
			
			System.out.println(data);
			
		}
		
		
	}

}
