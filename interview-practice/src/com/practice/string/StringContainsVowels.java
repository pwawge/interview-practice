package com.practice.string;

import java.util.ArrayList;
import java.util.List;

public class StringContainsVowels {
	public static void main(String[] args) {

		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false
		
		List<String> vowels = new ArrayList<>();		
		vowels.add("a");
		vowels.add("e");
		vowels.add("i");
		vowels.add("o");
		vowels.add("u");
		
		String str = "present";
		boolean flag = false;
		for(int i=0;i<str.length();i++) {
			if(vowels.contains(str.charAt(i)+"")) {
				flag = true;
			}
		} 
		if(flag) {
			System.out.println("vowels present");
		}else {
			System.out.println("vowels not present");
		}

	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");
	}
	
	
	
	

}
