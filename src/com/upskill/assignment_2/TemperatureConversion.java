package com.upskill.assignment_2;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// Write a Java program to convert temperature from Fahrenheit to Celsius degree.
tempConversion();
	}
	public static void tempConversion(){
	//	@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		Double farn, cels;
		System.out.println("Enter the temperature in farengeit - ");
		farn = input.nextDouble();
		cels = (farn - 32)*9/5;
		System.out.println("Converted temp be " + cels);
	}

}
