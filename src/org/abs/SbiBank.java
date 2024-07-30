package org.abs;

public class SbiBank implements RbiBank {

	@Override
	public void savings() {
		System.out.println("Savings % is : 5");		
	}

	@Override
	public void fixed() {
		System.out.println("Fixed % is : 6");
				
	}

	@Override
	public void loan() {
		System.out.println("Loan % is : 7");		
	}
	
	public static void main(String[] args) {
		
		SbiBank s = new SbiBank();
		s.savings();
		s.fixed();
		s.loan();
	}

}
