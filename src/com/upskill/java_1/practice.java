package com.upskill.java_1;

public class practice {
  
	public static int hourlyIncome = 65;
			
	public static void main(String[] args) {
	
		practice obj = new practice();
 obj.monthlyIncomeVoid();
 System.out.println("my yearly income = " + obj.yearlyIncomeReturn());
	System.out.println("my per minute income = " + obj.MIReturn());
	weeklyIncomeStatic();
	}
public void monthlyIncomeVoid (){
	int MI = hourlyIncome * 180;
	System.out.println("my monthly income = " + MI);

}

public int yearlyIncomeReturn(){
	int YI = hourlyIncome * 2000;
	return YI;
}
public int MIReturn(){
	int MI = hourlyIncome / 60 ;
	return MI;
}
public static void weeklyIncomeStatic(){
	int WI = hourlyIncome * 40;
	System.out.println ("my weekly income = " + WI );
}
}

