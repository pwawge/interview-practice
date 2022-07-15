package com.practice.sort;

public class Student implements Comparable<Student>{
	
	private Integer id;
	
	private int age;
	
	private String name;

	public Student(Integer id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}	
}
