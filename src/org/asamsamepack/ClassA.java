package org.asamsamepack;

public class ClassA {
	
//    protected void protectedMethod() {
//    	System.out.println("protectedMethod");
//    }
	
	// default means method dont have default keyword
	void defaultClassMethod() {
		System.out.println("defaultClassMethod");
	}
	
	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.defaultClassMethod();
		
	}

}
