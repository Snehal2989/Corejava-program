package com.superAndthis_keywords.Example7;

public class Test {

	public static void main(String[] args) {

		B b = new B();
		/* for this output : Consructor----A----int
                             constructor---of----A*/
		
		System.out.println();

		B b1 = new B(33);
		/* for this output : Consructor----A----int
                             constructor---of----A
                             39
                             20
                             10
                             constructor---B---int*/
		
		System.out.println();
		B b2 = new B("gghj");
		/* 
		 * Consructor----A----int
           constructor---of----B
           39
           20
           10
           constructor---B---int
           constructor---B---String*/

	}

}
