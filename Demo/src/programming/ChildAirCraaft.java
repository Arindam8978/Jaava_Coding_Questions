package programming;

import abstraction.ParentAirCraft;

public class ChildAirCraaft extends ParentAirCraft{
	
	public static void main(String[] args)
	{
		ChildAirCraaft ca = new ChildAirCraaft();
		ca.engin();
		ca.saftey();
		ca.bodyColor();
		
		//if i use private method in parent class we cannot use this methods
		//we cannot create the object of the asbtract class, and child class are forced to implementes the abstract method
		//ParentAirCraft pa = new ParentAirCraft();
	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("blue");
	}
	

}
