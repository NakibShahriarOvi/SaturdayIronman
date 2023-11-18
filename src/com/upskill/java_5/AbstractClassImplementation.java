package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

	public static void main(String[] args) {
	
	}

	@Override
	public void iDoors() {
		System.out.println("My car has 4 doors");
		
	}

	@Override
	public String iEngine() {
		System.out.println("My car has dual motor");
		return "Dual Motor";
	}

	@Override
	public String iColor() {
		System.out.println("My car is red");
		return "Red";
	}

	@Override
	public int iWheels() {
		System.out.println("My car has 4 wheels");
		return 4;
	}

}
