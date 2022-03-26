package com.pattern.factory;

public abstract class BirthdayCake {
	
	public String name;
	public String price;
	
	public abstract void prepareIngredients();
	
	public void mixIngredients() {
		System.out.println("Mixing the ingredients");
	}
	
	public void fillTheMold() {
		System.out.println("Filling the Mold");
	}
	
	public void baking() {
		System.out.println("Baking of Cake with the required temperature");
	}
	
	public void coolDown() {
		System.out.println("Cooling down cake to normal temperature ");
	}

}
