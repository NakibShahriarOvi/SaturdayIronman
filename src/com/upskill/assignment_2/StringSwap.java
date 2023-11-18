package com.upskill.assignment_2;

public class StringSwap {

	public static void main(String[] args) {
		// Write a program to swap two string variables (Talen, Tech) and display result on the 
	   //  screen.
swapstring();
	}
	public static void swapstring(){
		String a= "Talen";
		String b= "Tech";
		String temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Swap string of a is "+a);
		System.out.println("Swap string of b is "+b);
		
	}

}
