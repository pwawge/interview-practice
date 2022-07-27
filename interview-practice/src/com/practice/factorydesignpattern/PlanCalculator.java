package com.practice.factorydesignpattern;

public abstract class PlanCalculator {
	
	protected double rate;  
    abstract void getRate();  

    public void calculateBill(int units){  
         System.out.println(units*rate);  
     }  


}
