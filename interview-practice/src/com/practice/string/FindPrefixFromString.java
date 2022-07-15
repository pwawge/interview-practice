package com.practice.string;

public class FindPrefixFromString {
	
	public static void main(String[] args) {
		String[] strArr={"java2blog","javaworld","javabean","javatemp"};
		System.out.println("largest prefix = "+findLargestPrefix(strArr));
	}
	
	private static String findLargestPrefix(String [] strings) {
		
		String smallString = smallWord(strings);
		int smallStringLength = smallString.length();
		
		for(int i=0;i<strings.length;i++) {
		int temp = 0;
			for(temp=0;temp< strings[i].length();temp++) {
				if(strings[i].charAt(temp) != smallString.charAt(temp)) {
					break;
				}
			}
			if(temp<smallStringLength) {
				smallStringLength = temp;
			}			
		}				
		return smallString.substring(0, smallStringLength);		
	}
		
	private static String smallWord(String [] strings) {
		
		String smallString = strings[0];
		
		for(int i=1;i<strings.length;i++) {
			if(smallString.length() > strings[i].length()) {
				smallString = strings[i];
			}
		}
		System.out.println("small string = "+smallString);
		
		return smallString;
				
	}

}
