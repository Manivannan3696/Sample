package org.asamsamepack;

public class ClassB extends ClassA {
	
	
	public static void main(String[] args) {
		
		//object
		ClassA a1 = new ClassA();
		a1.defaultClassMethod();
//		a1.protectedMethod();
		
		//extends
		ClassB b = new ClassB();
		b.defaultClassMethod();
//		b.protectedMethod();
		
	}

}
