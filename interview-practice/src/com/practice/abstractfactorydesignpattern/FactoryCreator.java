package com.practice.abstractfactorydesignpattern;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("Plan")) {
			return new PlanFactory();
		}
		return null;
	}
}