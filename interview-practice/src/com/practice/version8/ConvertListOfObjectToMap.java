package com.practice.version8;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertListOfObjectToMap {

	public static void main(String[] args) {

		// Created Sample data here
		List<Student> listOfStudent = new ArrayList<>();
		listOfStudent.add(new Student(1, "Pradip"));
		listOfStudent.add(new Student(2, "Anjali"));
		listOfStudent.add(new Student(3, "Ajay"));
		listOfStudent.add(new Student(4, "Amit"));

		// Conversion on List of Object to Map
		LinkedHashMap<Integer, String> linkedHashMap = listOfStudent.stream().collect(
				Collectors.toMap(Student::getId, Student::getName, (id, name) -> id + ", " + name, LinkedHashMap::new));

		// iterate using forEch
		linkedHashMap.forEach((id, name) -> System.out.println(id + " = " + name));

		// Print final output
		System.out.println(linkedHashMap);

	}

}

class Student {

	private Integer id;
	private String name;

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
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
