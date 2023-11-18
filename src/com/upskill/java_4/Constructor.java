package com.upskill.java_4;

public class Constructor {
	
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String studentName;
	int studentAge;
	int studentPhone;
	public Constructor(String name){
	studentName = name;	
	}
	public Constructor (int age){
	studentAge= age;
	}
	public Constructor (String name, int age, int phn){
		studentName = name;	
		studentAge= age; 
		studentPhone= phn;
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor("Saiful");		
    System.out.println(obj.studentName);
    
    
    Constructor obj2 = new Constructor(24);		
    System.out.println( obj2.studentAge);
    System.out.println( "\n\n");
    Constructor obj3 = new Constructor("Nakib", 28, 9384);		
    System.out.println( obj3.studentName);
    System.out.println( obj3.studentAge);
    System.out.println( obj3.studentPhone);
    System.out.println( "\n\n");
	}

}
