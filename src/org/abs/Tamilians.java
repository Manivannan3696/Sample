package org.abs;
// Child class
public class Tamilians extends Indians {

	@Override
	public void foodHabit() {
		System.out.println("Following south food habit");		
	}

	@Override
	public void culture() {
			System.out.println("Following south culture");	
	}
	
	public static void main(String[] args) {
		
		Tamilians t = new Tamilians();
		t.foodHabit();
		t.culture();                       
		t.panCard();
		t.aadharCard();
	}
	

}
