package com.practice.sort;

import java.util.Comparator;

public class NameLengthComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().length() - o2.getName().length();
	}

}
