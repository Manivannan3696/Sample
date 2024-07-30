package org.arrayprog;

public class Array2dprog {
	
	public static void main(String[] args) {
		
		//datatype[][] variablename = new datatype[size][size];
		
		int [][] a = new int [2][2];
		
		// i   j
		a [0] [0] = 10;
		a [0] [1] = 20;
		a [1] [0] = 30;
		a [1] [1] = 40;
		
		// how to print the 2d array data
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				System.out.println(a[i][j]);
				
			}
			
		}
		
		
	}

}
