package com.practice.prototypedesignpattern;

import java.io.IOException;

public class PrototypeTest {
	public static void main(String[] args) throws IOException {  
         
           
        EmployeeRecord e1=new EmployeeRecord(1001,"Pradip","Developer",18.0,"abc@gmail.com");  
          
        e1.showRecord();  
        System.out.println("\n");  
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();  
        e2.showRecord();  
    }     

}
