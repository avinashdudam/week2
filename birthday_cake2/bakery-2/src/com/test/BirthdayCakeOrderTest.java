package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pattern.factory.BirthdayCake;
import com.pattern.factory.BirthdayCakeFactory;
import com.pattern.factory.BirthdayCakeStore;

// This file tests both singleton and factory patterns
public class BirthdayCakeOrderTest {

	@Test
	// Book a chocolate cake for Maria
	public void testOrderChocolateCake() {
		BirthdayCakeFactory factory = new BirthdayCakeFactory();
		BirthdayCakeStore store = new BirthdayCakeStore(factory);
		
		BirthdayCake cake = store.orderCake("chocolate", "Maria");
		
		assertNotNull(cake);
		assertEquals(cake.name, "Chocolate Cake");
		assertEquals(cake.price, "10$");
	}
	
	@Test
	// Book a chocolate cake for John
	public void testPineAppleCake() {
		BirthdayCakeFactory factory = new BirthdayCakeFactory();
		BirthdayCakeStore store = new BirthdayCakeStore(factory);
		
		BirthdayCake cake = store.orderCake("pineapple", "John");
		
		assertNotNull(cake);
		assertEquals(cake.name, "PineApple Cake");
		assertEquals(cake.price, "15$");
	}
	
	@Test
	// Book a chocolate cake for Ravi
	public void testRedVelvetCake() {
		BirthdayCakeFactory factory = new BirthdayCakeFactory();
		BirthdayCakeStore store = new BirthdayCakeStore(factory);
		
		BirthdayCake cake = store.orderCake("redvelvet", "Ravi");
		
		assertNotNull(cake);
		assertEquals(cake.name, "RedVelvet Cake");
		assertEquals(cake.price, "20$");
	}
	
	@Test
	// Invalid
	public void testInvalid() {
		BirthdayCakeFactory factory = new BirthdayCakeFactory();
		BirthdayCakeStore store = new BirthdayCakeStore(factory);
		
		BirthdayCake cake = store.orderCake("", "Ravi");
		
		assertNull(cake);
	}

}
