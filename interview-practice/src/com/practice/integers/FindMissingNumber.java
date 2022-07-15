package com.practice.integers;

public class FindMissingNumber {

	public static void main(String[] args) {
 
		int[] arrayOfIntegerNumber = {1,2,3,5,6,7,8,9};
		
		int n1 = 9;
		int a1 = 1;
		int l1 = 9;
		
		int sum = n1*(a1 + l1)/2;
		
		System.out.println(sum);
		
		for(int number : arrayOfIntegerNumber) {
			sum = sum - number;
		}
		System.out.println(sum);
	}

}
