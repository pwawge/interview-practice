package com.practice.integers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOdd {
	public static void main(String[] args) {
		Integer[] evenOdd= {21,2,3,42,54,16,17,8,9};
		
		for(int i=0;i<=evenOdd.length-1;i++) {
			if(evenOdd[i]%2==0) {
				System.out.println("Even No :"+evenOdd[i]);
			}
			else {
				System.out.println("Odd No :"+evenOdd[i]);
			}
		}
		
		
		
		System.out.println(Arrays.asList(evenOdd).stream().filter(n->n%2==0).collect(Collectors.toList()));
		System.out.println(Arrays.asList(evenOdd).stream().filter(n->n%2!=0).collect(Collectors.toList()));
		
		
	}

}
