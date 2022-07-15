package com.practice.string;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatWordFromSentense {

	public static void main(String[] args) {
		String str = "Factory design pattern is the most commonly used pattern in Java";
		
		// 2. get duplicate count using Map
        Map<String, Integer> duplicateCountMap = Arrays.asList(str.split(" "))
                .stream()
                .collect(
                        Collectors.toMap(Function.identity(), obj -> 1, Math::addExact)
                        );
		System.out.println("Final output [Word = count] = "+duplicateCountMap);
		
		
	}
	
	

}
