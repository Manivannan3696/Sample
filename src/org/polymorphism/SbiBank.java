package org.polymorphism;

public class SbiBank extends RbiBank {

	@Override  // @ - annotation
	public void savings() {
		System.out.println("SBI Saving % is : 6%");		
		super.savings();
	}
	
	@Override
	public void fixed() {
		System.out.println("SBI fixed % is : 7%");		
		super.fixed();
	}
	
	// try for loan
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		
	}
	
	
}
