package com.practice.singleton.earlyInstantiation;

public class StudentInfo {
	private Integer id;
	private Integer age;
	private String name;
	
	private static StudentInfo obj=new StudentInfo();//Early, instance will be created at load time  
	
	private StudentInfo() {
		
	}
	
	public static StudentInfo getInstance() {
		return obj;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
