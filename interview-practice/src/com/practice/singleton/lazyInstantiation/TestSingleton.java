package com.practice.singleton.lazyInstantiation;

public class TestSingleton {

	public static void main(String[] args) {
		
		// CREATE OBJECT
		StudentInfo std = StudentInfo.getInstance();
		std.setId(1);std.setAge(10);std.setName("Pradip");
		
		// REUSE OBJECT
		StudentInfo std2 = StudentInfo.getInstance();
		
		System.out.println("ID: "+std2.getId()+" \nAGE: "+std2.getAge()+" \nNAME: "+std2.getName());
	}
}
