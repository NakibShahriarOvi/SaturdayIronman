package com.upskill.java_1;

public class MethodTypes {
	/* Types of Methods
	  
	 1. Void Method 
	 2. Static Method
	 3. Return type method
	 */
    public static int hourlyIncome = 65;
	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();  // obj is the instance of a class.
        obj.annualIncomeVoid();
        
    System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
    weeklyIncomeStatic();
	}
  // void method 
	public void annualIncomeVoid(){ 
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println ("My Annual Income = " + calculateAnnualIncome);
	}
	
  // return type Method
	public int monthlyIncomeReturn(){
		int claculateMonthlyIncome = hourlyIncome * 180;
		return claculateMonthlyIncome;
	}
	
  //static Method
	public static void weeklyIncomeStatic(){
	int calculateWeeklyIncome = hourlyIncome * 40;
	System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
}








