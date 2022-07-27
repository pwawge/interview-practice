package com.practice.builderdesignpattern;

public class BuilderTest {

	public static void main(String args[]) {
		CDBuilder cdBuilder = new CDBuilder();
		CDItemType cdType1 = cdBuilder.buildSonyCD();
		cdType1.showItems();

		CDItemType cdType2 = cdBuilder.buildSamsungCD();
		cdType2.showItems();
	}
}
