package com.Typecasting.example2;

public class Test {

	public Department getInfo_1() {

		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();

		return d;
		// return d;
		// return e; Here we can return e also bcz e is child of d
	}

	public Company getInfo_2() {

		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();

		return d;
		// return d;
		// return e; Here we can
	}

	public Company getInfo_3() {

		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();

		return e;

	}

	public Employee getInfo_4() {

		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();

		return e;

	}
	
	public Department getInfo_5() {

		Company c = new Company();
		Department d = new Department();
		Employee e = new Employee();

		return e;
		// return d;
		// return e; Here we can return e also bcz e is child of d
	}

	public static void main(String[] args) {

		Test t = new Test();

		// For first method
		System.out.println();
		Department d1 = t.getInfo_1();
		System.out.println(d1.D_name);

		// For second method
		System.out.println();
		Department d2 = (Department) t.getInfo_2(); // here i need to typecast bcz return type is company
		System.out.println(d2.D_name);

		// for third method
		System.out.println();
		Company c = t.getInfo_3();
		System.out.println(c.c_name);
		
		// For fourth method
		System.out.println();
		Employee e1 = t.getInfo_4();
		System.out.println(e1.e_name);// it will return employee name value
		System.out.println(e1);// it will return address of employee object
		
		// For fifth method
		System.out.println();
		Employee e2 = (Employee)t.getInfo_5();
		System.out.println(e2);
		System.out.println(e2.e_name);
		
		
		
		Company c3 = t.getInfo_5();
		System.out.println(c3.c_name);
		
		Department d4 = t.getInfo_4();
		System.out.println(d4.D_name);
		
	}

}
