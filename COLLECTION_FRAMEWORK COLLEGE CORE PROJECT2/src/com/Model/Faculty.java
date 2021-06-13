package com.Model;

public class Faculty {

	private int fid;
	private String fname;
	private Course course;
	
	@Override
	public String toString() {
		return "Faculty Information --> [Faculty ID : " + fid + ", Faculty Name : " +fname +" , Course : " +course+ "]";
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

}
