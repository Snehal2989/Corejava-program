package com.Find_Maximum_number_inArray.Example2;

public class Test {

	public static void main(String[] args) {
		
		//syntax : int array[] = new int[size];
		Student sarray1[] = new Student[3];  //creating array which return type is class name
		
//		Student sarray1[] = null;
//				
//		sarray1[0].setRollno(101);
//		sarray1[0].setName("xyz");
//		sarray1[0].setMarks(67);
//		
//		sarray1[1].setRollno(102);
//		sarray1[1].setName("dfg");
//		sarray1[1].setMarks(40);
//		
//		sarray1[2].setRollno(101);
//		sarray1[2].setName("xyz");
//		sarray1[2].setMarks(67);
		
		
		sarray1[0] = new Student(101,"asd",56);
		sarray1[1] = new Student(102,"vbn",46);
		sarray1[2] = new Student(103,"tgb",76);

		
		//value storing loop and display array
		
		for(int i = 0;i<sarray1.length ;i++) {
			
			System.out.println("Rollno : "+sarray1[i].getRollno() +" , Name : "+sarray1[i].getName()+" , Marks : "+sarray1[i].getMarks());
		}
		
		// write logic to find maximum marks of student
		
		Student maxArray = sarray1[0];
		
		for(int i =0 ;i<sarray1.length ;i++) {
			
			if(sarray1[i].getMarks()>maxArray.getMarks()) {
				
				maxArray = sarray1[i];
			}
		}
		
		System.out.println("Topper Student : ");
		System.out.println("Rollno : "+maxArray.getRollno()+" , Name : "+maxArray.getName()+" , Marks : "+maxArray.getMarks());
		
		
	}
}
