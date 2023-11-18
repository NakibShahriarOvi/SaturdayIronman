package com.upskill.java_4;

public class Practice3 {
	String customerName;
	int bankid;
public Practice3(String name, int id){
	customerName= name;
	bankid= id;
}
	public static void main(String[] args) {
   Practice3 obj= new Practice3("nakib",1001 );
   System.out.println(obj.customerName+ " " + obj.bankid);
	
	Practice3 obj2= new Practice3("saiful",1002 );
	System.out.println(obj2.customerName + " " + obj2.bankid);
}

}                 
