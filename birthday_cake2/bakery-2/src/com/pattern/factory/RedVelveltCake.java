package com.pattern.factory;

public class RedVelveltCake extends BirthdayCake {

	public RedVelveltCake() {
		name = "RedVelvet Cake";
		price = "20$";
	}

	@Override
	public void prepareIngredients() {
		System.out.println("Preparing the ingredients for Red velvet falvour");
	}
}
