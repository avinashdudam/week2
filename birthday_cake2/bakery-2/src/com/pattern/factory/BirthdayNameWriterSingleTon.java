package com.pattern.factory;

public class BirthdayNameWriterSingleTon {
	
	private static BirthdayNameWriterSingleTon obj = null;

	private BirthdayNameWriterSingleTon() {
	}

	public static BirthdayNameWriterSingleTon getInstance() {
		if (obj == null) {
			synchronized (BirthdayNameWriterSingleTon.class) {
				if (obj == null) {
					obj = new BirthdayNameWriterSingleTon();
				}
			}
		}
		return obj;
	}

	protected void writeBirthdayName(String name) {
		System.out.println("Written the name: " +  name + " on Cake ");
	}

}
