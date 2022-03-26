package com.pattern.factory;

public class BirthdayCakeStore {

	BirthdayCakeFactory factory;

	public BirthdayCakeStore(BirthdayCakeFactory factory) {
		this.factory = factory;
	}

	public BirthdayCake orderCake(String type, String birthdayName) {
		BirthdayCake cake = this.factory.createCakeOrder(type);
		
		if (cake == null) {
			return null;
		}

		cake.prepareIngredients();
		cake.mixIngredients();
		cake.fillTheMold();
		cake.baking();

		BirthdayNameWriterSingleTon writer = BirthdayNameWriterSingleTon.getInstance();
		writer.writeBirthdayName(birthdayName);
		
		System.out.println("Cake Order of type: " + cake.name + " with price " + cake.price + " is Ready ");

		return cake;
	}

}
