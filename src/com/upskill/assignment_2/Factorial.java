package com.upskill.assignment_2;

public class Factorial {

	public static void main(String[] args) {
		//Write Java Program to display Factorial of Number 7.
		
		        int number = 7;
		        int factorial = 1;

		        for (int i = 1; i <= number; i++) {
		            factorial *= i;
		        }

		        System.out.println("Factorial of " + number + " is: " + factorial);
		    }
	}


