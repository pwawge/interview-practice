package com.practice.integers;

import java.util.HashMap;
import java.util.Map;

public class Sample {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		String str = "IV";
		Integer number=0;
		for(int i=0;i<=str.length()-1;i++) {
			number = number + map.get(str.charAt(i)+"");
		}
		System.out.println(number);
		
	}
}
