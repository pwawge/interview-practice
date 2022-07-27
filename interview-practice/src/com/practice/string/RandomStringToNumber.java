package com.practice.string;

import java.util.HashMap;
import java.util.Map;

public class RandomStringToNumber {

	public static void main(String[] args) {

		System.out.println(convertRandomStringToNumber("sixone"));

	}

	private static int convertRandomStringToNumber(String randomString) {

		Map<String, Integer> wordsAndDigitMap = new HashMap<String, Integer>();
		wordsAndDigitMap.put("one", 1);
		wordsAndDigitMap.put("two", 2);
		wordsAndDigitMap.put("three", 3);
		wordsAndDigitMap.put("four", 4);
		wordsAndDigitMap.put("five", 5);
		wordsAndDigitMap.put("six", 6);
		wordsAndDigitMap.put("seven", 7);
		wordsAndDigitMap.put("eight", 8);
		wordsAndDigitMap.put("nine", 9);
		wordsAndDigitMap.put("ten", 10);

		String[] CONSTANT_VALUE = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
		StringBuilder number = new StringBuilder();
		for (int i = 0; i <= CONSTANT_VALUE.length - 1; i++) {
			StringBuilder capturedChar = new StringBuilder();
			for (int j = 0; j < CONSTANT_VALUE[i].length(); j++) {
				if (randomString.contains(CONSTANT_VALUE[i].charAt(j) + "")) {
					randomString.replaceFirst(CONSTANT_VALUE[i].charAt(j)+ "", "");
					capturedChar.append(CONSTANT_VALUE[i].charAt(j));
				}
				if (randomString.equals("")) {
					break;
				}
			}
			if (wordsAndDigitMap.containsKey(capturedChar.toString())) {
				number.append(wordsAndDigitMap.get(capturedChar.toString()));
			}
		}
		if (number.toString().length() > 0) {
			return Integer.parseInt(number.toString());
		}
		return -1;
	}
}
