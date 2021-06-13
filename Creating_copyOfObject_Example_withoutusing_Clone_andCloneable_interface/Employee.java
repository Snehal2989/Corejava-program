package com.Creating_copyOfObject_Example_withoutusing_Clone_andCloneable_interface;

// Creating copy of object without using clone() method and cloneable interface.
/* this topic indirectly we can relate deep cloning. where original object remains same and its copy created in different
object. take a note that address of object are different*/

public class Employee {

	private int eid;
	private String ename;

	

	// here i am creating the copy() method which have return type of employee

	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public Employee copy() {

		Employee copyobject = new Employee();
		copyobject.eid = this.eid;
		copyobject.ename = this.ename;

		return copyobject;

	}

}
