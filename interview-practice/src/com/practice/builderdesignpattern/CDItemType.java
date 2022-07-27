package com.practice.builderdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class CDItemType {

	private List<PackingDepartment> items = new ArrayList<PackingDepartment>();

	public void addItem(PackingDepartment packs) {
		items.add(packs);
	}

	public void getCost() {
		for (PackingDepartment packs : items) {
			packs.price();
		}
	}

	public void showItems() {
		for (PackingDepartment packing : items) {
			System.out.print("CD name : " + packing.pack());
			System.out.println(", Price : " + packing.price());
		}
	}
}
