package org.stringmethods;

public class StringMethods {
	
	public static void main(String[] args) {
		
		//          01234567891011
		
		String s = "java program";
		
		// shortcut to know the return type
		// ctrl+2 then release then press L
		
		int length = s.length();
		System.out.println(length);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		// string methods are case sensitive
		int indexOf = s.indexOf('m');
		System.out.println(indexOf);
		
		int indexOf2 = s.indexOf('p');
		System.out.println(indexOf2);
		
		int lastIndexOf = s.lastIndexOf('r');
		System.out.println(lastIndexOf);
		
		char charAt = s.charAt(0);
		System.out.println(charAt);
		
		boolean equals = s.equals("java progr");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("JAVA PROGRA");
		System.out.println(equalsIgnoreCase);
		
		boolean contains = s.contains("selenium");
		System.out.println(contains);
		
		String replace = s.replace("java","selenium");
		System.out.println(replace);
		
     	boolean startsWith = s.startsWith("a");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("gram");
		System.out.println(endsWith);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String trim = s.trim();
		System.out.println(trim);
		
    	String order = " SAMSUNG GALAXY M31 smartphone ";
    	String afterTrim = order.trim();
    	
    	String database = "SAMSUNG GALAXY M31 smartphone";
    	
    	boolean equals2 = afterTrim.equals(database);
    	System.out.println(equals2);
  	    
    	
		

	}

}
