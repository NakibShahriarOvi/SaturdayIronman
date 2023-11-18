package com.upskill.assignment_3;

public class Assignment_3_4 {
//	Bank is a class that provides functionality to get interest rate. 
//	Display different interest rate using rate functionality for Chase, City and TD banks followed by 8%, 7% and 9%. 
//	Hints: using method override.

void displayInterestRate(){
	System.out.println("Default Interest Rate is NONE");
}
public static void main(String[] args) {
	Assignment_3_4 obj0 = new ChaseBank();
	obj0.displayInterestRate();
	Assignment_3_4 obj1 = new CitiBank();
	obj1.displayInterestRate();
	Assignment_3_4 obj2 = new TDBank();
	obj2.displayInterestRate();
	}

}
class ChaseBank extends Assignment_3_4{
	void displayInterestRate(){
		System.out.println("Chase Bank interest rate is 8%");
	}
}
class CitiBank extends Assignment_3_4{
	void displayInterestRate(){
		System.out.println("Citi Bank interest rate is 7%");
	}
}
class TDBank extends Assignment_3_4{
	void displayInterestRate(){
		System.out.println("TD Bank interest rate is 9%");
	}
}