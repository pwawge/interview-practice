package com.practice.abstractfactorydesignpattern;



public class GenerateBillTest {

	public static void main(String[] args) {

		AbstractFactory bankFactory = FactoryCreator.getFactory("Plan"); 
		PlanCalculator plan = bankFactory.getPlan("DOMESTICPLAN");
		plan.getRate();
		plan.calculateBill(5);
		

	}
}
