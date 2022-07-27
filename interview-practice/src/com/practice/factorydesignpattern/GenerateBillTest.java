package com.practice.factorydesignpattern;

public class GenerateBillTest {

	public static void main(String[] args) {

		GetPlanFactory factory = new GetPlanFactory();
		System.out.println("DOMESTICPLAN");
		// DOMESTICPLAN // COMMERCIALPLAN // INSTITUTIONALPLAN
		PlanCalculator planCalculatorDomastic = factory.getPlan("DOMESTICPLAN");

		planCalculatorDomastic.getRate();
		planCalculatorDomastic.calculateBill(5);
		System.out.println("COMMERCIALPLAN");
		PlanCalculator planCalculatorCommercial = factory.getPlan("COMMERCIALPLAN");

		planCalculatorCommercial.getRate();
		planCalculatorCommercial.calculateBill(5);
		System.out.println("INSTITUTIONALPLAN");
		PlanCalculator planCalculatorInternational = factory.getPlan("INSTITUTIONALPLAN");

		planCalculatorInternational.getRate();
		planCalculatorInternational.calculateBill(5);

	}
}
