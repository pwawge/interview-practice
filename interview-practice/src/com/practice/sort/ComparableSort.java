package com.practice.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSort {
	
	public static void main(String[] args) {
		Student s1 = new Student(1, 27, "Anajli");
		Student s2 = new Student(2, 32, "Pradip");
		Student s3 = new Student(3, 2, "ABC");
		Student s4 = new Student(4, 3, "Darshita");
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s3);
		list.add(s2);
		list.add(s4);
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		
	}

}
