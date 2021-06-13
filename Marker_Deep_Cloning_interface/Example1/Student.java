package com.Marker_Deep_Cloning_interface.Example1;
// Deep cloning

/*Cloneable : Cloneable interface is implemented by a class to make Object. clone() method valid thereby making field-for-field copy. 
 * This interface allows the implementing class to have its objects to be cloned instead of using a new operator.*/
 
public class Student implements Cloneable {
	
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public Student() {// Constructor of Student
		
		System.out.println("Constructor ------- Student");  // in deap cloning constructor execute only for  one time
	}
	@Override 
	protected Object clone() throws CloneNotSupportedException {
		// here return type is Object
		return super.clone();
	}
	
	@Override
	public String toString() { // This is toString() method
		
		return "[Rollno : "+rollno+" Name : "+name+"]";
	}
}
