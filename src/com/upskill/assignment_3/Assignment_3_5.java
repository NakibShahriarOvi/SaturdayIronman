package com.upskill.assignment_3;

public class Assignment_3_5 {
	
	//Write a java program which will display 5 employee information(name, age, salary and address).

	static int count = 1;
	Assignment_3_5(String name, int age, long salary, String address){
	System.out.println("Employee number - "+ count);
	System.out.println("Employee name - "+ name);
	System.out.println("Employee age - "+ age);
	System.out.println("Employee salary - "+ salary);
	System.out.println("Employee address - "+ address);
	count++;
	System.out.println("");
	}
	
	public static void main(String[] args) {
		Assignment_3_5 obj0= new Assignment_3_5("Saiful",30,1500000,"Flushing");
		Assignment_3_5 obj1= new Assignment_3_5("Asraf",29,1400000,"Bronx");
		Assignment_3_5 obj2= new Assignment_3_5("Azad",35,2500000,"manhatten");
		Assignment_3_5 obj3= new Assignment_3_5("Rahim",30,2000000,"Brooklyn");
	}

}
