package com.upskill.assignment_2;

public class Loops_1 {

	public static void main(String[] args) {
		//  Write a program in Java to display the multiplication table of (eight)8.

//int i;
//int num = 8;
//
//
//System.out.println("Multiplication Table for 8:");
//
//
//for ( i = 1; i <=10; i++) {
//    int result = num * i;
//    System.out.println(num + " x " + i + " = " + result);
//}
//	}
	for (int row=1; row<=8; row++){
		for (int column=1; column<=10; column++){
			int mul= row * column;
			System.out.print(mul + " ");
		}
		System.out.println(" ");
	}
	}
	}







