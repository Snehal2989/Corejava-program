package com.Find_Maximum_number_inArray.Example1;

public class Test {
	
	public static void main(String[] args) {
		
		int array[] = {10,30,40,20,50,70,60};
		
		int max = array[0];
		
		for(int i = 0; i<array.length ;i++) {
			
			if(array[i] > max) {
				
				max = array[i];
			}
		}
		
		System.out.println("maximum element in array is :"+max);
	}

}
