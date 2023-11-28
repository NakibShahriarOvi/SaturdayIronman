package com.upskill.java_6;

public class Singleton {
            // Singleton is a class that can have only one object
	
	private Singleton(){
		
	}
	
	
	
	
	private static Singleton SingletonObj = new Singleton();
	
	public static Singleton getInstance(){
		return SingletonObj;
	}
protected static void demo1(){
System.out.println("Demo 1 method for singleton class")	;
}
protected static void demo2(){
System.out.println("Demo 2 method for singleton class")	;
}
protected static void demo3(){
System.out.println("Demo 3 method for singleton class")	;
}

// change for GIT pull request practice
// this changes are in review
// git changes using eclipse
protected static void demo4(){
System.out.println("Demo IV method for singleton class")	;
}
}