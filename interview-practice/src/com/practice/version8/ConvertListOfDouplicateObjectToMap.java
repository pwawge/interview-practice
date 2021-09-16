package com.practice.version8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfDouplicateObjectToMap {
public static void main(String[] args) {
		
		//Created Duplicate Sample data here
		List<Student1> listOfStudent = new ArrayList<>();
		listOfStudent.add(new Student1(1,"Pradip"));
		listOfStudent.add(new Student1(1,"Dip"));
		listOfStudent.add(new Student1(2,"Anjali"));
		listOfStudent.add(new Student1(2,"Sangita"));
		listOfStudent.add(new Student1(3,"Ajay"));
		listOfStudent.add(new Student1(3,"Ram"));
		listOfStudent.add(new Student1(4,"Amit"));
		
		//Conversion on List of Object to Map
		Map<Integer, List<String>> linkedHashMap = listOfStudent.stream().collect(Collectors.groupingBy(Student1::getId,Collectors.mapping(Student1::getName, Collectors.toList())));
		
		// iterate using forEch
		linkedHashMap.forEach((id,name) -> System.out.println(id+" = "+name));
		
		//Print final output
		System.out.println(linkedHashMap);
		
		
		
	}
}
class Student1{
	
	private Integer id;
	private String name;
	
	public Student1(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student1() {
		super();
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
	
	
	
}
