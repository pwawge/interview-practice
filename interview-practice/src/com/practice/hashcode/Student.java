package com.practice.hashcode;

public class Student {
	
	private int id;
	private String name;
	private int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	 @Override
	public int hashCode() {
		
		return this.id;
	}
	@Override
	public boolean equals(Object obj) {
		Student s2 = (Student) obj;
		return this.id == s2.id;
	}
	 
}
