package com.Polymorphism.Overloading.Example7;

public class Test {
int s_id;
String s_name;

 Test() {
	System.out.println("This is default constructor!");
}

Test(int s_id,String s_name){
	this.s_id = s_id;
	this.s_name = s_name;
	System.out.println("This is parameterized Constructor");
	
}
	public static void main(String[] args) {
		
		Test t = new Test();
		
		System.out.println("Default constructor values:");
		System.out.println("student id  : \n"+t.s_id+"\nstudent name  : "+t.s_name);
		
		
		System.out.println();
		Test t1 = new Test(101,"vanshiki");
		System.out.println("Parameterized constructor values: ");
		System.out.println("student id  : "+t1.s_id+"\nstudent name  : "+t1.s_name);

	}

}
