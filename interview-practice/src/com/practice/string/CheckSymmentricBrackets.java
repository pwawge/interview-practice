package com.practice.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CheckSymmentricBrackets {

	public static void main(String[] args) {

		List<String> listOfString = new ArrayList<String>();
		listOfString.add("{([])}");
		listOfString.add("({{)");
		listOfString.add("{([]}");
		listOfString.add("{([])");
		listOfString.add("{([])}{({})}{}");
		listOfString.add("{()))){{{{}}}}{{)()()");
		for (String str : listOfString) {
			System.out.println(str + " is symmentric =" + checkSymmentric(str));
		}

	}

	private static boolean checkSymmentric(String str) {

		Stack<Character> brackets = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != ' ' && (ch == '{' || ch == '[' || ch == '(')) {
				brackets.push(ch);
			} else if (!brackets.empty() && (ch == '}' || ch == ']' || ch == ')')) {
				brackets.pop();
			}
		}
		if (brackets.isEmpty()) {
			return true;
		}

		return false;

	}

}
