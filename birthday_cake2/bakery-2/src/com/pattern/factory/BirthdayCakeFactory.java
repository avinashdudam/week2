package com.pattern.factory;

public class BirthdayCakeFactory {

	public BirthdayCake createCakeOrder(String type) {
		BirthdayCake cake = null;
		
		if (type.equals("chocolate")) {
			cake = new CholocateCake();
		} else if (type.equals("pineapple")) {
			cake = new PineAppleCake();
		} else if (type.equals("redvelvet")) {
			cake = new RedVelveltCake();
		}
		
		return cake;
	}

}
