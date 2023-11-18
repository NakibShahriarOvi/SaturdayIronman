package com.upskill.java_1;

public class Variables {
	
	  // Variables in Java
	
	  // Instance or global variable - Variables declared in class level, outside method
	  // Static Variable - variables belong to class and don't require creating object
	  // local variable - variables declared in methods
	  
	  // method variable - variables used as method parameter
	
	public String country = "USA"; // Instance or global variable - Variables declared in class level, outside method
	
	public static String  region = "North America";      // Static Variable - variables belong to class and don't require creating object

	public static void main(String[] args) {
		String city = "Bloomfield";                       // local variable - variables declared in methods
		String police = "BPD";
		
		System.out.println(city);
		System.out.println(region);
		Variables obj = new Variables();  // obj is the instance of a class.
		System.out.println(obj.country);
        nj("Essex");
        pa("Bensalem");
	}
 
	public static void nj(String County) {
		String city = "Bloomfield";
		String police = "BPD";
		
		System.out.println(city);
		System.out.println(region);
		System.out.println(County);
		
}
	
	public static void pa(String County) {
		String city = "Phili";
		String police = "PPD";
		System.out.println(city);
		System.out.println(region);
		System.out.println(County);
	}
}