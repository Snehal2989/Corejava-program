package com.Marker_Shallow_Cloning.Example1;

// Shallow cloning
public class Test {

	public static void main(String[] args) {
		
		// here hashode of s1 & s2 is same. because in shallow cloning s2 is pointing s1..it is not a separate objected created
		Student s1 = new Student();
		System.out.println(s1.hashCode()); // hashCode = 366712642
		s1.setName("xyz");
		s1.setRollno(1);
		
		System.out.println(s1);
		
		Student s2 = s1;
		System.out.println(s2.hashCode());// hashCode = 366712642

		s2.setName("fyz");
		s2.setRollno(2);
		
		System.out.println(s2);
		
	}
}
