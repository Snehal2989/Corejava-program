package com.Marker_Deep_Cloning_interface.Example2;

public class Test {

	public static void main(String[] args)throws Exception {
		
		/*Note: you cannot use simply normal parameterized constructor in cloning or in general also.
		you need to use setter method , so that in future you can able to override the existing values.*/
		
		Student s1 = new Student("xyz",1,"pune");
		System.out.println(s1.hashCode());
		System.out.println(s1);
		
		System.out.println();
		Student s2 = (Student)s1.clone();
		System.out.println(s2.hashCode());
		s2.setName("abc");
		s2.setRollno(2);
		s2.setAddress("nagpur");
		
		System.out.println(s2);
	
		
	}
}
