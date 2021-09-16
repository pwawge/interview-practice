package com.practice.algorithms;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9};
		int findNumber= 5;
		
		System.out.println(binarySerchRecursive(array,findNumber,0,array.length-1));
		
	}


	private static boolean binarySerchRecursive(int[] array,int findNumber, int left, int right) {
		
		if(left>right) {
			return false;
		}
		
		int mid = (left+right)/2;
		
		if(array[mid]==findNumber) {
			//if Element found
			return true;
		}else if(array[mid] > findNumber) {
			//sliding the right corner
			binarySerchRecursive(array,findNumber,left, mid-1);
		}else {
			//sliding the left corner
			binarySerchRecursive(array,findNumber,mid+1, right);
		}
		
		return false;
	}
}
