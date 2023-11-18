package com.upskill.assignment_3;

public class Assignment_3_3 {
	//  Write a java program that explains runtime polymorphism.

	public static void main(String[] args) {
		Assignment_3_3 obj0=new Assignment_3_3();
		obj0.Wheels();
		Assignment_3_3 obj1=new Truck();
		obj1.Wheels();
		Assignment_3_3 obj2=new Car();
		obj2.Wheels();
		Assignment_3_3 obj3=new Bike();
		obj3.Wheels();
	}

 void Wheels() {
	System.out.println("Every vehicle have wheels");	
	}

}
class Truck extends Assignment_3_3{
	void Wheels(){
		System.out.println("Truck has 6 wheels");
	}
}
class Car extends Assignment_3_3{
	void Wheels(){
		System.out.println("Truck has 4 wheels");
	}
}
class Bike extends Assignment_3_3{
	void Wheels(){
		System.out.println("Truck has 2 wheels");
	}
}