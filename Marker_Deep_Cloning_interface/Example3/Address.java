package com.Marker_Deep_Cloning_interface.Example3;

public class Address implements Cloneable {

	String city;
	String area;
	int zipcode;
	
	@Override
	public String toString() {
		
		return "[ City : "+city+" Area : "+area+" Zipcode : "+zipcode+"]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
