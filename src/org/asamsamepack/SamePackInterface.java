package org.asamsamepack;

public interface SamePackInterface {
	
	default void defaultMethod() {
		
		System.out.println("default method with block");
		
	}
	
	void otherMethod();

}
