package com.upskill.java_2;

public class IfElseStatement {					// its a conditional statement

	public static void main(String[] args) {
 int Age = 101;
 if (Age <= 13){
	 System.out.println("Child");
 }else if(Age > 13 && Age <= 18){
	 
	 System.out.println("Teenager");
 }else if(Age >18 && Age <= 60){
	 if(Age>=100){
		 System.out.println("Champion");
	 }
	 System.out.println("Adult");
 }else{
	 System.out.println("Senior");
 }
 

	}

}

