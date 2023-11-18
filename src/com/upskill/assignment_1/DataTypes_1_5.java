package com.upskill.assignment_1;

public class DataTypes_1_5 {
	public static void Student1() {
		String name = "Alam";
		int Age = 21;
		System.out.println("Student 1: Name - " + name +", Age - " + Age +".");
	}
	public void Student2() {
		String name = "Belal";
		int Age = 25;
		System.out.println("Student 2: Name - " + name +", Age - " + Age +".");
	}
	public static void Student3() {
		String name = "Choyon";
		int Age = 23;
		System.out.println("Student 3: Name - " + name +", Age - " + Age +".");
	}
	public void Student4() {
		String name = "Delwar";
		int Age = 22;
		System.out.println("Student 4: Name - " + name +", Age - " + Age +".");
	}
	public static void main(String[] args) {
		Student1();
		Student3();
		DataTypes_1_5 obj = new DataTypes_1_5();
		obj.Student4();
		obj.Student2();
		System.out.println("Student 5: Name - " + obj.Student5_1() + ", Age - " + obj.Student5()+ ".");
	}
public int Student5(){
	int Age = 21;
	return Age;

	

}
public String Student5_1(){
	String name = "Gorden";
	return name;
}
}
