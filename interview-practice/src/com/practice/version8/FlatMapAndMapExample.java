package com.practice.version8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapAndMapExample {
	
	public static void main(String[] args) {
		mapExample();
		flatMapExample();
		
	}
	public static void mapExample() {
		
		List<String> numbersOfChar = Arrays.asList("P","R","A","D","I","P");
		
		numbersOfChar = numbersOfChar.stream().map((element) -> element.toLowerCase()).collect(Collectors.toList());
		
		System.out.println(numbersOfChar);
	}

	public static void flatMapExample() {
		
		List<String> letters1 = Arrays.asList("P", "r");
		List<String> letters2 = Arrays.asList("a", "d", "i");
		List<String> letters3 = Arrays.asList("p", "w");
		
		List<List<String>> listOfLetters = Arrays.asList(letters1,letters2,letters3);
		
		List<String> totalCharList = listOfLetters.stream().flatMap(List::stream).collect(Collectors.toList());

		System.out.println(totalCharList);
	}
}
