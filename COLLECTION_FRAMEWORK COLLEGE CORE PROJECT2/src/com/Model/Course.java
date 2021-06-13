package com.Model;

public class Course {

	private int cid;
	private String cname;
	

	@Override
	public String toString() {
		return "Course Information --> [Course ID : " + cid + ", Course Name : " + cname + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
