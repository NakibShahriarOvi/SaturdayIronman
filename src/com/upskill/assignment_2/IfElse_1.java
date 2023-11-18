package com.upskill.assignment_2;

public class IfElse_1 {

	public static void main(String[] args) {
		// A school conducts a 100 mark exam for its student and grades them as
		// follows:
		// Grade:
		// Grade A: Marks>=90
		// Grade B: Marks>=80-89
		// Grade C: Marks>=70-79
		// Grade D: Marks>=60-69 AND FAIL THEM WHO HAS <60
		//
		// Write a java program to calculate the grade for a student in a method
		// passing
		// parameter for grade to display every grade type, using if..else
		// statement
		int Marks = 9;
		if (Marks < 60) {
			if(Marks<=20){
				System.out.println("Terminated");
			}
			else
			System.out.println("Fail");
		} else if (Marks >= 60 && Marks <= 69) {
			System.out.println("Grade D");
		} else if (Marks >= 70 && Marks <= 79) {
			System.out.println("Grade C");
		} else if (Marks >= 80 && Marks <= 89) {
			System.out.println("Grade B");
		} else if (Marks >= 90 && Marks <= 100) {
			System.out.println("Grade A");
		}
	}

}
