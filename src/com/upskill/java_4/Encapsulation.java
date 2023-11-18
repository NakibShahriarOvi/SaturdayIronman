package com.upskill.java_4;

public class Encapsulation {
   // Used to hide the data using setter and getter method
	
	
	private String name;
	private int ssn = 334593;
	private String username = "nakibovi";
	
	//Setter Method- name
	public void setName(String value){
		name = value;
	}
	
	//Setter Method- ssn
public void setssn(int num){
			ssn = num;
	}

	//Getter Method- name
	public String getName(){
		return name;
	}
	
	//Getter Method- userName
		public String getusername(){
			return username;
	}
	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setName("Rasel");
		System.out.println(obj.getName());
		
		obj.setssn(44567);
		System.out.println(obj.getusername());

	}

}
