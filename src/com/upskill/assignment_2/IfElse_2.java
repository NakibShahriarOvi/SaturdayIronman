package com.upskill.assignment_2;

public class IfElse_2 {

	public static void main(String[] args) {
//		 Write two java functions which will return two different integer values, write a 
//	     program to compare those numbers and send message that one number is bigger 
//	     than other.
//		int i=40;
//		int j=60;
//	    if(i<j) {
//			System.out.println("Rahim is bigger than Karim" );
//		}else if(j<i){
//			System.out.println("Karim is bigger than Rahim");
//		}else{
//			System.out.println("Both ate of same age");
//		}
//
//	}
comparenumber();
	}
public static int myFunction1(){
	int a=32;
	return a;
}
public static int myFunction2(){
	int b=23;
	return b;
}
public static void comparenumber(){
if (myFunction1()>myFunction2()){
	System.out.println("first one is bigger");
}
else if (myFunction1()==myFunction2()){
	System.out.println("both are equal");
}
else {
	System.out.println("second one is bigger");
}
}
}
