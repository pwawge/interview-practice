package com.practice.hashcode;

public class TestHashCodeEquals{
	
	public static void main(String[] args) {
		Student s1 = new Student(1,"pradip",32);
		Student s2 = new Student(1,"pradip",32);
		
		System.out.println((s1 == s2)+" hashcode s1= "+s1.hashCode()+" hashcode s2= "+s2.hashCode());
		System.out.println(s1.equals(s2)+" hashcode s1= "+s1.hashCode()+" hashcode s2= "+s2.hashCode());
		System.out.println(s1.equals(s2)+" hashcode s1= "+System.identityHashCode(s1)+" hashcode s2= "+System.identityHashCode(s2));
		
		
		System.out.println(s1);
		
		
		
	}

}
