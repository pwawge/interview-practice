package com.practice.immutableclass;

import java.util.HashMap;
import java.util.Map;

public final class Student {
	private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
    
 // Constructor of immutable class
    // Parameterized constructor
    public Student(String name, int regNo,
                   Map<String, String> metadata)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;
 
        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();
 
        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
             metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
 
        this.metadata = tempMap;
    }
    
 // Method 1
    public String getName() { return name; }
 
    // Method 2
    public int getRegNo() { return regNo; }
    
 // Method 3
    // User -defined type
    // To get meta data
    public Map<String, String> getMetadata()
    {
 
        // Creating Map with HashMap reference
        Map<String, String> tempMap = new HashMap<>();
 
        for (Map.Entry<String, String> entry :
             this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

}
