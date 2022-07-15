package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatCharFromSentense {

	public static void main(String[] args) {
		String str = "Factory design pattern is the most commonly used pattern in Java";
		Map<Character,Integer> map = new HashMap<>();
		for(int i =0 ;i<str.length();i++) {
			char ch = str.charAt(i);
			map.put(ch, (map.containsKey(ch)? (map.get(ch)+1):1 ));
			
		}
		System.out.println("Final output [char = count] = "+map);

	}
	
	

}
