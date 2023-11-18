package com.upskill.java_1;

public class Practice1 {
public static int HourlySalary = 65;
	public static void main(String[] args) {
		Practice1 obj = new Practice1();
	obj.MonthlySalaryVoid();	
System.out.println("My Yearly Salary is " + obj.YearlySalaryReturn());
WeeklySalaryStatic();
System.out.println("My country is " + obj.Country);
NY();
System.out.println("My Landmark is " + obj.MyLandMark());
	}
public void MonthlySalaryVoid(){
	int MonthlySalary = HourlySalary * 200 ;
	System.out.println("My Monthly Salary is " + MonthlySalary);
}
public int YearlySalaryReturn(){
	int YearlySalary = HourlySalary * 1000 ;
	return YearlySalary;
}
public static void WeeklySalaryStatic(){
	int WeeklySalary = HourlySalary * 40;
	System.out.println("My Weekly Salary is " + WeeklySalary);
}
public String Country = "USA";

public static void NY(){
	String City = "Bronx";
	System.out.println("My City is " + City);
}
public String MyLandMark(){
	String LandMark = "Morris Park";
	return LandMark;
}


}
