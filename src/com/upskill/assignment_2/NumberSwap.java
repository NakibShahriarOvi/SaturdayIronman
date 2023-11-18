package com.upskill.assignment_2;

public class NumberSwap {

	public static void main(String[] args) {
		//  You are given two integer number (a=25, b=30), write a program to swap them and 
	    //  display result on the screen. 
swap();
	}
	public static void swap(){
		int a=25;
		int b=30;
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}

}
