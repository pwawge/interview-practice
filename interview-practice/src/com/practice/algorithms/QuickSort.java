package com.practice.algorithms;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] array = {4,5,3,1,2,9,8};
		
		quickSort(array,0,array.length-1);
		System.out.println(Arrays.toString(array));
	}
	public static void quickSort(int[] array, int left , int right) {
		if(left >= right) {
			return;
		}
		int pivot = array[(left+right)/2];
		int index = partition(array,left,right,pivot);
		quickSort(array,left,index-1);
		quickSort(array,index,right);
		
	}
	private static int partition(int[] array, int left, int right, int pivot) {
		while(left <= right) {
			while(array[left] < pivot) {
				left++;
			}
			while(array[right] > pivot) {
				right--;
			}
			if(left <= right) {
				swap(array,  left,  right);
				left++;
				right--;
			}
		}
		
		return left;
	}
	private static void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

}
