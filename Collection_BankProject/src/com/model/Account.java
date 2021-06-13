package com.model;

public class Account {
	private int ac_no;
	private String act_name;
	private String act_address;
	private String act_pan;
	private double act_bal;
	
	public int getAc_no() {
		return ac_no;
	}

	public void setAc_no(int ac_no) {
		this.ac_no = ac_no;
	}

	public String getAct_name() {
		return act_name;
	}

	public void setAct_name(String act_name) {
		this.act_name = act_name;
	}

	public String getAct_address() {
		return act_address;
	}

	public void setAct_address(String act_address) {
		this.act_address = act_address;
	}

	public String getAct_pan() {
		return act_pan;
	}

	public void setAct_pan(String act_pan) {
		this.act_pan = act_pan;
	}

	public double getAct_bal() {
		return act_bal;
	}

	public void setAct_bal(double act_bal) {
		this.act_bal = act_bal;
	}

//	public Account(int ac_no, String act_name, String act_address, String act_pan, double act_bal) {
//		
//		this.ac_no = ac_no;
//		this.act_name = act_name;
//		this.act_address = act_address;
//		this.act_pan = act_pan;
//		this.act_bal = act_bal;
//	}
	
	@Override
	public String toString() {
		return "Account [ac_no=" + ac_no + ", act_name=" + act_name + ", act_address=" + act_address + ", act_pan="
				+ act_pan + ", act_bal=" + act_bal + "]";
	}

	

}
