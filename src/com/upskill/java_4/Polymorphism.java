package com.upskill.java_4;

import com.upskill.java_1.MethodTypes;

public class Polymorphism extends MethodTypes {
	
// its object with different form
// ability of an object to take different form
	// Method overloading/ complile time Polymorphism/ static binding
	// Method overridding/ run time Polymorphism/ dynamic binding

	

	public static void main(String[] args) {
		car();
		car("Red");
		car(4);
		car("EV4", 4);
		car(true);
		Polymorphism obj = new Polymorphism();
		 obj.annualIncomeVoid();
	}
	public void annualIncomeVoid(){ 
		int calculateAnnualIncome = hourlyIncome * 2000;
		int bonus = 25000;
		int rent = 15000;
		int side = 10000;
		int totalIncome = calculateAnnualIncome + bonus + rent + side;
		System.out.println ("My Annual Income = " + totalIncome);
	}
	public static void car() {
		System.out.println("My car is Tesla | ");
	}

	public static void car(String f) {
		System.out.println("My car Tesla | It's color is : " + f);
	}

	public static void car(int door) {
		System.out.println("My car Tesla | It has " + door + " doors.");
	}

	public static void car(String engine, int wheels) {
		System.out.println("My car Tesla . The engine is " + engine + " and has " + wheels + " wheels");
	}

	public static void car(boolean electric) {
		System.out.println("My car is Tesla | Is Electric : " + electric);
	}
}
