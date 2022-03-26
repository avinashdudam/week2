package com.pattern.factory;

public class PineAppleCake extends BirthdayCake{

	public PineAppleCake() {
		name = "PineApple Cake";
		price = "15$";
	}

	@Override
	public void prepareIngredients() {
		System.out.println("Preparing the ingredients for Pine Apple falvour");
	}

}
