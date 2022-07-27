package com.practice.abstractfactorydesignpattern;

public class InstitutionalPlan extends PlanCalculator{

	private double rate;
	
	@Override
	public void getRate() {
		rate=5.50; 
		
	}


}
