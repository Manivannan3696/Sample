package org.stringtype;

public class StringType {
	
	public static void main(String[] args) {
		
		//Literal string
		
		String s1 = "java";
		String s2 = "java";
		String s3 = "program";
		
       // to know the memory address
	   // System : C -> identityHashCode()
		
	   int id1 = System.identityHashCode(s1);
	   System.out.println(id1);
	   
	   int id2 = System.identityHashCode(s2);
	   System.out.println(id2);
	   
	   int id3 = System.identityHashCode(s3);
	   System.out.println(id3);
	   
	   System.out.println("***************************");
	   
	   // Non-Literal String
	   
	   String s4 = new String ("selenium");
	   String s5 = new String ("selenium");
	   String s6 = new String ("project");
	   
	   int id4 = System.identityHashCode(s4);
	   System.out.println(id4);
	   
	   int id5 = System.identityHashCode(s5);
	   System.out.println(id5);
	   
	   int id6 = System.identityHashCode(s6);
	   System.out.println(id6);
	  
	   
	}

}
