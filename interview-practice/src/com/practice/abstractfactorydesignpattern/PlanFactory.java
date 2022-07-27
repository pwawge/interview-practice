package com.practice.abstractfactorydesignpattern;

public class PlanFactory extends AbstractFactory {

	@Override
	public PlanCalculator getPlan(String plan) {
		if (plan == null) {
			return null;
		}
		if (plan.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (plan.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (plan.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}

}
