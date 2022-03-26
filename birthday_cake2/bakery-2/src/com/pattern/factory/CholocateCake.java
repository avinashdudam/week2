package com.pattern.factory;

public class CholocateCake extends BirthdayCake{

	public CholocateCake() {
		name = "Chocolate Cake";
		price = "10$";
	}

	@Override
	public void prepareIngredients() {
		System.out.println("Preparing the ingredients for Chocolate falvour");
	}

}
