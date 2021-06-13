package com.Marker_Deep_Cloning_interface.Example1;
/* Deep cloning : 

Deep copy is 100% disjoint between the current object and duplicate object .

If we change the state of object it won’t effect to the duplicate object.*/

public class Test {

	public static void main(String[] args) throws Exception {

		// take a note , here address or hashCode of every object is different//

		/* In deep cloning constructor execute only for one time....because we creating main object of student[ example: new Student()]
		   only for one time*/

		Student s1 = new Student();
		System.out.println(s1.hashCode()); // hashCode(Address) of s1 = 366712642
		s1.setRollno(23); //23
		s1.setName("abc"); //abc

		Student s2 = (Student) s1.clone();
		System.out.println(s2.hashCode()); // hashCode(Address) of s2 = 1829164700
		s2.setRollno(24); //24
		s2.setName("mahi"); //mahi

		Student s3 = (Student) s1.clone();
		System.out.println(s3.hashCode()); // hashCode(Address) of s2 = 2018699554
		s3.setRollno(25);// 25
		s3.setName("xyz"); // xyz

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		// Note : s2 and s3 are hold duplicate copes of s1 ...but s2 and s3 different
		// objects even there address are different

		// so overall in Deep cloning object are different with their different address
		// ....but they are holding the duplicates copy of original object.

	}
}
