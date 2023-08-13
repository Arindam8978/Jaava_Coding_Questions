package programming;

import InterFace.CentralTraffic;
import InterFace.ContinantelTraffice;

public class AustrlianTraffic implements CentralTraffic,ContinantelTraffice{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralTraffic	a = new AustrlianTraffic();
		
		/*
		 * the above line means an object for the AustrlianTraffic class to implement
		 * the method present in the CentralTraffic interface
		 */
		
		a.red();
		a.flashYellow();
		a.green();
		
		AustrlianTraffic a1= new AustrlianTraffic();
		a1.walking();
		
		ContinantelTraffice a2= new AustrlianTraffic();
		a2.trainsymbol();
		
		//one class can implements more than one interface.
		
		
		
	}

	@Override
	public void green() {
		// TODO Auto-generated method stub
		System.out.println("green go implementation");
	}

	@Override
	public void red() {
		// TODO Auto-generated method stub
		System.out.println("red stop implementation");
		
	}

	@Override
	public void flashYellow() {
		// TODO Auto-generated method stub
		System.out.println("flash yellow wait implementation");
	}
	
	public void walking()
	{
		System.out.println("WalkingPlace");
	}

	@Override
	public void trainsymbol() {
		// TODO Auto-generated method stub
		System.out.println("Trains");
		
	}
	

}
