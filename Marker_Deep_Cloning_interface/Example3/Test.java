package com.Marker_Deep_Cloning_interface.Example3;

public class Test {

	public static void main(String[] args) throws Exception{
		// In deep cloning hashcode or Address is different of all object
		Address a1 = new Address();
		System.out.println(a1.hashCode()); // address = 366712642
		a1.city = "pune";
		a1.area = "hadpser";
		a1.zipcode = 123456;
		
		System.out.println(a1);
		
		Address a2 = (Address)a1.clone(); /* we need to typecast in Address because return type of clone() method
		                                    Object class which is indirectly parent of Address class*/
		System.out.println(a2.hashCode());// address = 1829164700
		a2.city = "nagpur";
		a2.area = "hingna";
		a2.zipcode = 440023;
		
		System.out.println(a2);
		
		Address a3 = (Address)a1.clone();
		System.out.println(a3.hashCode());//address =2018699554
		
		a3.city = "nagpur";
		a3.area = "bardi";
		a3.zipcode = 440021;
		
		System.out.println(a3);
		
	}
}
