package com.practice.version8;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FindPrimeNumberUsingStream {
	
	public static void main(String[] args) {
		System.out.println(isPrime(4));
		
	}
	
	public static boolean isPrime(int i) {
		
		IntPredicate isDivisible = index -> i % index == 0;
				
	 return i > 1 && IntStream.range(2, i).noneMatch(isDivisible);
		
	}
}
