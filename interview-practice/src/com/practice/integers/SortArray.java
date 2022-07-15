package com.practice.integers;

public class SortArray {

	public static void main(String[] args) {
		int [] numbers = {1,4,5,3,2,6};
		
		int temp=0;
		for(int i=0 ; i < numbers.length;i++) {
			 for (int j = i+1; j < numbers.length; j++) {     
				if(numbers[i] > numbers[j]) {				
					temp = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = temp;	
					
				}
			 }
			 System.out.println(numbers[i]);
		}
			
		
	}

}
