package com.practice.singleton.earlyInstantiation;

public class TestSingleton {

	public static void main(String[] args) {
		StudentInfo std = StudentInfo.getInstance();
		std.setId(1);std.setAge(10);std.setName("Pradip");
		
		StudentInfo std2 = StudentInfo.getInstance();
		
		System.out.println("ID: "+std2.getId()+" \nAGE: "+std2.getAge()+" \nNAME: "+std2.getName());
		
		
	}
}
