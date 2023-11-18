package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		int age = 30;			//variable
		int [] ageIronMan = new int []{25,30,34,21,18,19};	//Array
		String[] NameIronMan = new String [] {"Karim", "Jashim", "Rahim", "Jafar"};
			//Array index			  [0] [1] [2] [3]
		
		
		System.out.println("Name of the Student is " + NameIronMan[3]);
		System.out.println("His age is " + ageIronMan[3]);
		
		System.out.println("Number of Students- " + ageIronMan.length);
		System.out.println("Total Student names on record- " + NameIronMan.length);
		
		//Multi-Dimentional Array
		int [][] ageIronMan2D = {{25,32,37,21,27,32},			//[0][0] [0][1] [0][2]
				                 {26,30,33,28}};				//[1][0] [1][1] [1][2]
		System.out.println("Age of Student is " + ageIronMan2D [0][4]);
		
		// Hashmap store multiple data using key-value pair, Implemintation of Map interface
		
		HashMap <String, Integer> Student = new  HashMap <String, Integer>();
		Student.put("Karim", 25);
		Student.put("Jashim", 30);
		Student.put("Rahim", 34);
		Student.put("Jafar", 21);
		System.out.println("HashMap Student Age : " + Student.get("Rahim"));
		
		HashMap <String, String> World = new  HashMap <String, String>();
		World.put("USA", "New York");
		World.put("BD", "Dhaka");
		World.put("Canada", "Toronto");
		World.put("India", "Delhi");
		System.out.println("HashMap Capital is " + World.get("USA"));
		
		
		//Hashset store unordered collection containing unique value, implementation of Set Interface
		
		HashSet<String> car = new HashSet <String>();
		car.add("BMW");
		car.add("Toyota");
		car.add("Tesla");
		car.add("Audi");
		System.out.println("Car : " + car);
		
		//HashTable store multiple data using  key-value pair, no Duplicate, also is syncronized (only one thread can be modified)
		
		Hashtable <String, String> region = new  Hashtable <String, String>();
		region.put("USA", "New York");
		region.put("BD", "Dhaka");
		region.put("Canada", "Toronto");
		region.put("India", "Delhi");
		System.out.println("Hashtable Capital is " + region.get("USA"));
		
		
		
		}
	}


