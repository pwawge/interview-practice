package com.practice.string;

public class ReversString {
	
	public static void main(String[] args) {
		
		reverseString("Pradip");
		reverseStringWithoutFunction("Pradip");
	}
	private static void reverseString(String input) {
		
		StringBuilder br = new StringBuilder(input);
		br.reverse();
		System.out.println(br.toString());
		
	}
	
	private static void reverseStringWithoutFunction(String input) {
			
		String str ="";
		for(int i= input.length()-1 ;i>=0;i--) {
			str+=input.charAt(i);
		}
		System.out.println(str);
	}
}
