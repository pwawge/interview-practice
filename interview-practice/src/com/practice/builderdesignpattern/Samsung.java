package com.practice.builderdesignpattern;

public class Samsung extends Company{

	@Override
	public String pack() {
		return "Samsung CD"; 
	}

	@Override
	public int price() {
		return 30;
	}

}
