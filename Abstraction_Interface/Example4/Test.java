package com.Abstraction_Interface.Example4;

public class Test {

	public static void main(String[] args) {
		
		Connection con = new Oracle();
		con.commit();
		con.rollback();
		
		System.out.println();
		Connection con1 = new Mysql();
		con1.commit();
		con1.rollback();
		
		
	}
}
