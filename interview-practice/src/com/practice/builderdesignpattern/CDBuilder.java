package com.practice.builderdesignpattern;

public class CDBuilder {

	public CDItemType buildSonyCD() {
		CDItemType cds = new CDItemType();
		cds.addItem(new Sony());
		return cds;
	}

	public CDItemType buildSamsungCD() {
		CDItemType cds = new CDItemType();
		cds.addItem(new Samsung());
		return cds;
	}
}
