package com.model;

public class Account {
	private int accno;
	private String acc_holder_name;
	private String address;
	private String pancard;
	private double balance;
	private long adhar_card;
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getAcc_holder_name() {
		return acc_holder_name;
	}
	public void setAcc_holder_name(String acc_holder_name) {
		this.acc_holder_name = acc_holder_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPancard() {
		return pancard;
	}
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public long getAdhar_card() {
		return adhar_card;
	}
	public void setAdhar_card(long adhar_card) {
		this.adhar_card = adhar_card;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", acc_holder_name=" + acc_holder_name + ", address=" + address
				+ ", pancard=" + pancard + ", balance=" + balance + ", adhar_card=" + adhar_card + "]";
	}
	
	

}
